(defproject yaspe-algos "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/carmine "2.12.2"]]
  :main ^:skip-aot yaspe-algos.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
