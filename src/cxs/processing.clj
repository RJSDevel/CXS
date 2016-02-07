(ns
  cxs.processing
  (:use cxs.rules))

(defn count-scores [m]
  (reduce + (vals m)))

;;
(defn processing [c]
  (println "Start processing...")
  (def total (count-scores c))
  (if (>= total min-scores)
    (println "The loan is approved")
    (println "The loan is not approved")))
