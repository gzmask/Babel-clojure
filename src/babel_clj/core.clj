(ns babel-clj.core
  (:gen-class))

(defn helloworld
  ([] (helloworld "No one"))
  ([someone] (str "Hello " someone)))

(defn -main []
  (println (helloworld "GzMask")))
