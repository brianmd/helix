(ns helix.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [helix.layout :refer [error-page]]
            [helix.routes.home :refer [home-routes]]
            [helix.routes.services :refer [service-routes]]
            [compojure.route :as route]
            [helix.middleware :as middleware]))

(def app-routes
  (routes
    #'service-routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))

(defn app [] (middleware/wrap-base #'app-routes))
