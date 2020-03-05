(ns status-im.react-native.js-dependencies)

(def config                 (js/require "react-native-config"))
(def fs                     (js/require "react-native-fs"))
(def keychain               (js/require "react-native-keychain"))
(def qr-code                (js/require "qrcode"))
(def react                  (js/require "react"))
(def react-native           (js/require "react-native"))
(def status-keycard         (js/require "react-native-status-keycard"))
(def webview                (js/require "react-native-webview"))
(def touchid-class          (js/require "react-native-touch-id"))
(def touchid                (.-default touchid-class))
(def EventEmmiter           (js/require "react-native/Libraries/vendor/emitter/EventEmitter"))
(def fetch-polyfill         (js/require "react-native-fetch-polyfill"))
(def fetch                  (.-default fetch-polyfill))
(def i18n                   (js/require "i18n-js"))
(def react-native-languages (.-default (js/require "react-native-languages")))
(def camera                 (js/require "react-native-camera"))
(def dialogs                (js/require "react-native-dialogs"))
(def image-crop-picker      (js/require "react-native-image-crop-picker"))
(def image-resizer          (js/require "react-native-image-resizer"))
(def snoopy                 (js/require "rn-snoopy"))
(def snoopy-filter          (js/require "rn-snoopy/stream/filter"))
(def snoopy-bars            (js/require "rn-snoopy/stream/bars"))
(def snoopy-buffer          (js/require "rn-snoopy/stream/buffer"))
(def background-timer-class (js/require "react-native-background-timer"))
(def background-timer       (.-default background-timer-class))
(def svg                    (js/require "react-native-svg"))
(def react-native-shake     (js/require "react-native-shake"))
(def react-native-screens   (js/require "react-native-screens"))
(def net-info               (js/require "@react-native-community/netinfo"))
(def mail-class             (js/require "react-native-mail"))
(def react-native-mail      (.-default mail-class))
(def async-storage          (.-AsyncStorage react-native))
(def back-handler           (.-BackHandler react-native))
(def desktop-linking        #js {:addEventListener (fn [])})
(def desktop-menu           #js {:addEventListener (fn [])})
(def desktop-config         #js {:addEventListener (fn [])})
(def desktop-shortcuts      #js {:addEventListener (fn [])})
(def safe-area-context      (js/require "react-native-safe-area-context"))
(def react-native-dark-mode (js/require "react-native-dark-mode"))

(def react-navigation-native      (js/require "@react-navigation/native"))
(def react-navigation-stack       (js/require "@react-navigation/stack"))
(def react-navigation-bottom-tabs (js/require "@react-navigation/bottom-tabs"))

(def react-native-haptic-feedback (js/require "react-native-haptic-feedback"))

(def react-native-reanimated (js/require "react-native-reanimated"))
(def react-native-redash (js/require "react-native-redash"))
(def react-native-gesture-handler (js/require "react-native-gesture-handler"))
