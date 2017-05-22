(ns stylefy.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [stylefy.tests.core-test :as core]
            [stylefy.tests.styles-test :as styles]))

(doo-tests 'stylefy.tests.core-test
           'stylefy.tests.styles-test)