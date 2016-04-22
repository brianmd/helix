(ns helix.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [helix.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[helix started successfully using the development profile]=-"))
   :middleware wrap-dev})
