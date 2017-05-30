(ns html-templating.core
  (:require [selmer.parser :as selmer]
            [selmer.filters :as filters]))

(selmer/add-tag!
  :uppercase
  (fn [args context-map content]
    (.toUpperCase (get-in content [:uppercase :content])))
  :endupppercase)

(selmer/render-file "{{content|safea}" {})
