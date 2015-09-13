(defproject gpio-socket "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/core.incubator "0.1.3"]]

  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-npm "0.6.1"]]

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:main gpio-socket.core
                                   :output-to "lib/server.js"
                                   :output-dir "lib"
                                   :optimizations :none
                                   :target :nodejs
                                   :cache-analysis true
                                   :source-map true}}]}

  :npm {:dependencies [[onoff "1.0.2"]
                       [source-map-support "0.2.8"]
                       [ws "0.8.0"]]})