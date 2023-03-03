(ns net.wikipunk.omg
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.omg.boot]
   [net.wikipunk.rdf.sm]
   [net.wikipunk.rdf.cmns-av]
   [net.wikipunk.rdf.lcc-lr]
   [net.wikipunk.rdf.lcc-cr]
   [net.wikipunk.rdf.gleif-base]
   [net.wikipunk.rdf.gleif-L1]
   [net.wikipunk.rdf.gleif-L2]
   [net.wikipunk.rdf.gleif-elf]
   [net.wikipunk.rdf.gleif-ra]
   [net.wikipunk.rdf.gleif-repex]))

(defrecord OMG []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))
