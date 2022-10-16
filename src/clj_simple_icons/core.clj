(ns clj-simple-icons.core
  (:require [schema.core :as s]))

(s/defschema License
  {:type s/Str
   :url  s/Str})

(s/defschema Icon
  {:slug       s/Str
   :hex        s/Str
   :source     s/Str
   :svg        s/Str
   :path       s/Str
   :guidelines s/Str
   :license    License})

(s/defschema Icons
  {:icons [Icon]})

(s/defn foo
  [x :- Icons]
  (println x "Hello, World!"))
