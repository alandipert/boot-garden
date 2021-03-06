(set-env!
  :dependencies '[[org.clojure/clojure       "1.6.0"       :scope "provided"]
                  [boot/core                 "2.0.0-pre22" :scope "provided"]
                  [ns-tracker                "0.2.2"]
                  [tailrecursion/boot-useful "0.1.3"       :scope "test"]])

(require '[tailrecursion.boot-useful :refer :all])

(def +version+ "1.2.5")

(useful! +version+)

(task-options!
  pom  [:project     'boot-garden
        :version     +version+
        :description "Boot task to compile Garden stylesheets to CSS."
        :url         "https://github.com/martinklepsch/boot-garden"
        :scm         {:url "https://github.com/martinklepsch/boot-garden"}
        :license     {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}])