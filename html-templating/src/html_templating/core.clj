(ns html-templating.core
  (:require [selmer.parser :as selmer]
            [selmer.filters :as filters]))

(selmer/add-tag!
  :image
  (fn [args context-map]
    (str "<img src=" (first args) "/>")))

(selmer/render "{% image 'http://foo.com/logo.jpg' %}" {})
