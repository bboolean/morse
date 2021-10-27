(ns morse.core-test
  (:require [clojure.test :refer :all]
            [morse.core :refer :all]))

(deftest change-to-upper-case-test
  (testing "change-to-upper-case"
    (is (=
         "UPPER?"
         (morse.core/change-to-upper-case "upper?")))))

(deftest split-into-vector-test
  (testing "split-into-vector"
    (is (=
         ["U" "P" "P" "E" "R" "?"]
         (morse.core/split-into-vector "upper?")))))

(deftest morse-reduce-predicate-test
  (testing "morse-reduce-predicate"
    (is (=
         "123 •--"
         (morse.core/morse-reduce-predicate "123" "W")))
    (is (=
         "123?"
         (morse.core/morse-reduce-predicate "123" "?")))))

(deftest to-morse-test
  (testing "to-morse"
    (is (=
         "•-"
         (morse.core/to-morse "A")))
    (is (=
         "-•••"
         (morse.core/to-morse "B")))
    (is (=
         "-•-• •- -?"
         (morse.core/to-morse "Cat?")))))

