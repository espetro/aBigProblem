;; These problems will be done with both Clojure vectors and lists

;; A few preset lists/vectors to work with
(def v1 [0 1 2 3 4 5 6 7 8 9])

(def l1 '(0 1 2 3 4 5 6 7 8 9))

;; P01 - Last element of a list/vector
(defn last-element
    [ls]
    (first (reverse ls)))

;; P02 - Last-but-one element of a list
(defn last-but-one-element
    [ls]
    (second (reverse ls)))

;; P03 - Kth element of a vector
(defn kth-vector
    [ls k]
    (get ls k))

;; P03 - Kth element of a list
(defn kth-list
    [ls k]
    (nth ls k))

;; P04 - Number of elements in a list
(defn len
    [ls]
    (reduce + (map (constantly 1) ls)))

;; P05 - Reverse a vector
(defn rev-vector
    [ls]
    (reduce conj [] ls))

;; P05 - Reverse a list
(defn rev-list
    [ls]
    (reduce conj '() ls))

;; P06 - Find if a vector is a palindrome

;; P06 - Find if a list is a palindrome

;; P07 - Flatten a nested vector structure

;; P07 - Flatten a nested list structure

;; P08 - Delete duplicated elements off a vector
(defn del-vector
    [ls]
    (reduce 
        (fn [xs y]
            (if (some #(= y %) xs)
                xs
                (conj xs y)))
        []
        ls))

;; P08 - Delete duplicated elements off a list
(defn del-list
    [ls]
    (reverse (into '() (del-vector ls))))

;; P09 - Pack consecutive duplicates of list elements into sublists

;; P10 - Run-length encoding of a list

;; ...

;; P14 - Duplicate the elements of a list
(defn dupli-list
    [ls X]
    (reduce #(concat %1 (take X (repeat %2)))
     []
     ls))

;; P14 - Duplicate the elements of a list
(defn dupli-vector
    [ls X]
    (into [] (dupli-list ls X)))