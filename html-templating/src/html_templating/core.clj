(ns html-templating.core
  (:require [selmer.parser :as selmer]
            [selmer.filters :as filters]))

(filters/add-filter! :custom-filter (fn [x] [:safe (.toUpperCase x)]))

(selmer/render "{{x|custom-filter}}" {:x "<div>I'm safe</div>"})
