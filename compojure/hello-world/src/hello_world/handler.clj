(ns hello-world.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
           (GET "/" [] "<h1>Hello Clojure World!</h1>")
           (route/not-found "<h1>Page Not Found!</h1>"))

(def app
  (wrap-defaults app-routes site-defaults))
