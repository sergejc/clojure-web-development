(ns html-templating.core
  (:require [selmer.parser :as selmer]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(selmer/render-file "hello.html" {:name "World" :items (range 10)})
