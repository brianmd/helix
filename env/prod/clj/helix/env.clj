(ns helix.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[helix started successfully]=-"))
   :middleware identity})
