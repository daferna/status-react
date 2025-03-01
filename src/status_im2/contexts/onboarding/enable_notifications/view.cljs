(ns status-im2.contexts.onboarding.enable-notifications.view
  (:require
    [quo2.core :as quo]
    [quo2.foundations.colors :as colors]
    [utils.i18n :as i18n]
    [utils.re-frame :as rf]
    [react-native.core :as rn]
    [react-native.platform :as platform]
    [react-native.safe-area :as safe-area]
    [status-im.notifications.core :as notifications]
    [status-im2.contexts.onboarding.common.background.view :as background]
    [status-im2.contexts.onboarding.common.navigation-bar.view :as navigation-bar]
    [status-im2.contexts.onboarding.enable-notifications.style :as style]
    [status-im2.contexts.shell.jump-to.utils :as shell.utils]))

(defn page-title
  []
  [quo/title
   {:container-style              {:margin-top 12}
    :title                        (i18n/label :t/intro-wizard-title6)
    :title-accessibility-label    :notifications-title
    :subtitle                     (i18n/label :t/enable-notifications-sub-title)
    :subtitle-accessibility-label :notifications-sub-title}])

(defn enable-notification-buttons
  [{:keys [insets]}]
  (let [profile-color (:color (rf/sub [:onboarding-2/profile]))]
    [rn/view {:style (style/buttons insets)}
     [quo/button
      {:on-press                  (fn []
                                    (shell.utils/change-selected-stack-id :communities-stack true nil)
                                    (rf/dispatch [::notifications/switch true platform/ios?])
                                    (rf/dispatch [:init-root :welcome]))
       :type                      :primary
       :before                    :i/notifications
       :accessibility-label       :enable-notifications-button
       :override-background-color (colors/custom-color profile-color 60)}
      (i18n/label :t/intro-wizard-title6)]
     [quo/button
      {:on-press                  (fn []
                                    (shell.utils/change-selected-stack-id :communities-stack true nil)
                                    (rf/dispatch [:init-root :welcome]))
       :accessibility-label       :enable-notifications-later-button
       :override-background-color colors/white-opa-5
       :style                     {:margin-top 12}}
      (i18n/label :t/maybe-later)]]))

(defn enable-notifications
  []
  (let [insets (safe-area/get-insets)]
    [rn/view {:style (style/page-container insets)}
     [background/view true]
     [navigation-bar/navigation-bar {:disable-back-button? true}]
     [page-title]
     [rn/view {:style style/page-illustration}
      [quo/text
       "Illustration here"]]
     [enable-notification-buttons {:insets insets}]]))
