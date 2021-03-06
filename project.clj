(defproject eden "0.3.0-SNAPSHOT"
  ;;:global-vars {*warn-on-reflection* true}
  :description "lua-based scripting language in Clojure(script)"
  :url "http://github.com/benzap/eden"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [org.clojure/tools.reader "1.2.2"]
                 [org.clojure/tools.cli "0.3.7"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-ancient "0.6.15"]
            [lein-doo "0.1.10"]]

  :repositories [["clojars" {:sign-releases false}]]

  :cljsbuild {:builds {:dev
                       {:source-paths ["src"]
                        :compiler {:output-dir "resources/public/js/compiled/out"
                                   :output-to "resources/public/js/compiled/eden.js"
                                   :optimizations :whitespace
                                   :pretty-print true
                                   :source-map "resources/public/js/compiled/eden.js.map"}}
                       :prod
                       {:source-paths ["src"]
                        :compiler {:output-to "resources/public/js/compiled/eden.min.js"
                                   :optimizations :advanced
                                   :pretty-print false}}
                       :test
                       {:id "test"
                        :source-paths ["src" "test"]
                        :compiler {:output-to "resources/public/js/compiled/test/test-runner.js"
                                   :output-dir "resources/public/js/compiled/test/out"
                                   :main eden.test-runner
                                   :target :nodejs
                                   :optimizations :none}}}}

  :doo {:build "test"
        :alias {:default [:node]}}

  :aliases {"project-version" ["run" "-m" "eden.utils.version/print-project-version"]}

  :profiles
  {:dev
   {:main eden.commandline
    :source-paths ["src" "dev" "test"]
    :dependencies [[org.clojure/tools.namespace "0.2.11"]]
    :repl-options {:init-ns eden.dev.user
                   ;;:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]
                   :port 9006
                   }}
   :uberjar
   {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]
    :main eden.commandline
    :aot [eden.core eden.commandline]
    }})
