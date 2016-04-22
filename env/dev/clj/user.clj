(ns user
  (:require [mount.core :as mount]
            [helix.figwheel :refer [start-fw stop-fw cljs]]
            helix.core))

(defn start []
  (mount/start-without #'helix.core/repl-server))

(defn stop []
  (mount/stop-except #'helix.core/repl-server))

(defn restart []
  (stop)
  (start))


