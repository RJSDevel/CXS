(ns
  cxs.rules)

(def min-scores 500)


(defn stub-rule [v] v)

(defn fio-rule [v] 0)

(defn bpl-rule [v] 0)

(defn age-rule [v]
  (cond
    (>= v 45) 50
    (>= v 35) 90
    (>= v 30) 60
    (>= v 25) 30
    (>= v 20) 10
    :else -100))

(defn experiens-rule [v]
  (cond
    (>= v 10) 100
    (>= v 3) 70
    (>= v 1) 40
    (< v 1) 10
    :else -100))

(defn profit-rule [v]
  (cond
    (>= v 25000) 40
    (> v 20000) 20
    (< v 20000) 10
    :else -100))

