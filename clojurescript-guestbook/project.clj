(defproject html-templating "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [selmer "0.9.6"]
                 [org.clojure/clojurescript "1.7.228" :scope "provided"]]
  :plugins [[lein-environ "1.0.1"]
            [migratus-lein "0.2.0"],
            [lein-cljsbuild "1.1.1"]]
  :cljsbuild
  {:builds {:app {:source-paths ["src/cljs"]
                  :compiler {:output-to "target/cljsbuild/public/js/app.js"
                             :output-dir "target/cljsbuild/public/js/out"
                             :main "guestbook.core"
                             :asset-path "/js/out"
                             :optimizations :none
                             :source-map true
                             :pretty-print true}}}}
  :clean-targets
  ^{:protect false}
  [:target-path
   [:cljsbuild :builds :app :compiler :output-dir]
   [:cljsbuild :builds :app :compiler :output-to]]
  )
