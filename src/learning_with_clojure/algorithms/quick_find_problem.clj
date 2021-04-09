(ns learning-with-clojure.algorithms.quick-find-problem)
;Solving the dynamic connectivity problem with different algorithms.
;QUICK-FIND algorithm
;O(n)
(defn build-vec
  [n]
  (vec (range n)))

()
;QUICK-UNION
;O()
(defn find-root
  [v e]
  (if (= e (nth v e))
    e
    (recur v (nth v e))))

(defn is-connected?
  [v p q]
  (= (find-root v p) (find-root v q)))

(defn union
  [v p q]
  (assoc v p (find-root v q)))