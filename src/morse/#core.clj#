(ns morse.core)

(def morse-conversion-map
  {"A" "•-"
   "B" "-•••"
   "C" "-•-•"
   "D" "-••"
   "E" "•"
   "F" "••-•"
   "G" "--• "
   "H" "••••"
   "I" "••"
   "J" "•---"
   "K" "-•-"
   "L" "•-••"
   "M" "--"
   "N" "-•"
   "O" "---"
   "P" "•--•"
   "Q" "--•-"
   "R" "•-• "
   "S" "•••"
   "T" "-"
   "U" "••-"
   "V" "•••-"
   "W" "•--"
   "X" "-••-"
   "Y" "-•--"
   "Z" "--••"})

(def change-to-upper-case clojure.string/upper-case)

(defn split-into-vector [a]
  (clojure.string/split (change-to-upper-case a) #""))

(defn morse-reduce-predicate [a v]
  (if
   (and
    (contains? morse-conversion-map v))
    (str a (if (not= "" a) " " "") (morse-conversion-map v))
    (str a v)))

(defn to-morse [a]
  (reduce
   morse-reduce-predicate
   ""
   (split-into-vector a)))

(defn -main
  "Convert text to morse"
  [& args]
  (println (to-morse (first args))))
