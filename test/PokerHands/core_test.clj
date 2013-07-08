(ns PokerHands.core-test
  (:use clojure.test
        PokerHands.core))

(deftest name-this-test
	(is (= true true)))

(deftest valid-rank-test 
	(is (isValidRank "4"))
	(is (not (isValidRank "Z")))
	(is (isValidRank "T"))
)

(deftest valid-card-test
	(is (not (isValidCard "")))
	(is (isValidCard "2D"))
	(is (not (isValidCard "14D")))
	(is (not (isValidCard "ZZ")))
)
