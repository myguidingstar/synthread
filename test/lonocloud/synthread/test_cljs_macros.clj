(ns lonocloud.synthread.test-cljs-macros
  (:require [cljs.test :refer [is]]))

(defmacro ->is
  ([x op]
   (let [xx '<topic>]
     `(let [~xx ~x]
        (is (~op ~xx))
        ~xx)))
  ([x binop v]
   (let [xx '<topic>]
     `(let [~xx ~x]
        (is (~binop ~xx ~v))
        ~xx))))
