(ns clojurescript-guestbook.core)

(-> (.getElementById js/document "content")
    (.-innerHTML)
    (set! "Hello World"))
