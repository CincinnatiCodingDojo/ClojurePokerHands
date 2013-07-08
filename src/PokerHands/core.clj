(ns PokerHands.core
 (:use [clojure.string]))



(defn isValidRank [rank]
	(def validRanks #{"2" "3" "4" "5" "6" "7" "8" "9" "T" "J" "Q" "K" "A"})
	(contains? validRanks rank
	)
)

(defn isValidCard [card]
	(and 
		(not (blank? card))
		(= (count card) 2)
		(isValidRank (subs card 0 1))
	)
)