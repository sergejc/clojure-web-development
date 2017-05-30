(ns html-templating.core
  (:require [selmer.parser :as selmer]
            [selmer.filters :as filters]))

(filters/add-filter! :emptly? empty?)

(selmer/render "{% if files|empty? %}no files{% else %}files{% endif %}" {:files []})
