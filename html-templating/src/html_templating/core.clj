(ns html-templating.core
  (:require [selmer.parser :as selmer]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(selmer/render "<p>Hello {{user.first}} {{user.last}}</p>" {:user {:first "John" :last "Doe"}})
