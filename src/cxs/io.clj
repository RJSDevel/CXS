(ns
  cxs.io
  (:use cxs.rules))

;; give user input -> String
(defn prompt-read [prompt rulecb]
  (print (format "%s: " prompt))
  (flush)
  (def input (read-line))
  (if (empty? input)
    (prompt-read prompt rulecb)
    (rulecb input)))

;; give user input -> int
(defn prompt-read-int [prompt rulecb]
  (try
    (rulecb (Integer. (re-find #"\d+" (prompt-read prompt stub-rule))))
    (catch Exception e (prompt-read-int prompt rulecb))))

;; print all key in map
(defn print-variants [m]
  (doall (for [[k] m] (println k))))

;; give prompt with variants
(defn prompt-read-variants [prompt v]
  (println "Avalable variants:")
  (print-variants v)
  (def answer (prompt-read prompt stub-rule))
  (if (contains? v answer)
    (get v answer)
    (prompt-read-variants prompt v)))

