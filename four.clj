(ns com.typoet.euler.four
  (:gen-class))

(defn- reverse-string [str]
  (.toString (.reverse (new StringBuffer str))))

(defn is-palindrome? [num]
    (let [str (.toString num)]
      (= str (reverse-string str))))

; really stupid, iterates over all 3 digit numbers (in reverse), checking
; for palindromes. Not sure of a better way to do it though, come back later.

(def palindromes
  (for [x (range 999 100 -1) y (range 999 100 -1) :when (is-palindrome? (* x y))] (* x y)))

(def largest-palindrome
  (last (sort palindromes)))

(defn -main []
  (println largest-palindrome))