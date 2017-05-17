(ns stylefy.examples.main
  (:require [reagent.core :as r])
  (:require-macros [stylefy.macros :refer [defstyle]]))

(defstyle generic-button {:border "1px solid black"
                          :background-color "grey"
                          :padding "5px"
                          :width "100px"
                          :height "70px"})

(defn- hello-world []
  [:div "Hello world"])

(defn start []
  (r/render hello-world (.getElementById js/document "app")))