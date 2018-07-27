(ns eden.stdlib.core
  (:require
   [eden.def :refer [set-function!]]))


(defn import-stdlib-core [eden]
  (-> eden
      ;; TODO: apply
      (set-function! 'assoc assoc)
      (set-function! 'assoc-in assoc-in)
      (set-function! 'associative? associative?)
      (set-function! 'atom atom)
      (set-function! 'bit-and bit-and)
      (set-function! 'bit-and-not bit-and-not)
      (set-function! 'bit-clear bit-clear)
      (set-function! 'bit-flip bit-flip)
      (set-function! 'bit-not bit-not)
      (set-function! 'bit-or bit-or)
      (set-function! 'bit-set bit-set)
      (set-function! 'bit-shift-left bit-shift-left)
      (set-function! 'bit-shift-right bit-shift-right)
      (set-function! 'bit-test bit-test)
      (set-function! 'bit-xor bit-xor)
      (set-function! 'boolean boolean)
      (set-function! 'boolean? boolean?)
      (set-function! 'butlast butlast)
      (set-function! 'byte byte)
      (set-function! 'char char)
      (set-function! 'char? char?)
      #?(:clj (set-function! 'class class))
      #?(:clj (set-function! 'class? class?))
      (set-function! 'coll? coll?)
      ;; TODO: comp
      (set-function! 'compare compare)
      ;; TODO: complement
      (set-function! 'concat concat)
      (set-function! 'conj conj)
      (set-function! 'cons cons)
      ;; TODO: constantly
      (set-function! 'contains? contains?)
      (set-function! 'count count)
      (set-function! 'counted? counted?)
      ;; TODO: cycle
      (set-function! 'dec dec)
      #?(:clj (set-function! 'decimal? decimal?))
      (set-function! 'dedupe dedupe)
      (set-function! 'disj disj)
      (set-function! 'dissoc dissoc)
      (set-function! 'distinct distinct)
      (set-function! 'distinct? distinct?)
      ;; TODO: do
      (set-function! 'double double)
      (set-function! 'double? double?)
      (set-function! 'drop drop)
      (set-function! 'drop-last drop-last)
      (set-function! 'drop-while drop-while)
      (set-function! 'empty empty)
      (set-function! 'even? even?)
      ;; TODO: every?
      (set-function! 'false? false?)
      (set-function! 'ffirst ffirst)
      ;; TODO: filter
      ;; TODO: filterv
      (set-function! 'find find)
      (set-function! 'first first)
      (set-function! 'flatten flatten)
      (set-function! 'float float)
      (set-function! 'float? float?)
      (set-function! 'flush flush)
      (set-function! 'fnext fnext)
      ;; TODO: fnil
      #?(:clj (set-function! 'format format))
      ;; TODO: future
      (set-function! 'get get)
      (set-function! 'get-in get-in)
      ;; TODO: group-by
      (set-function! 'identical? identical?)
      ;; TODO: identity
      (set-function! 'inc inc)
      (set-function! 'indexed? indexed?)
      (set-function! 'inst-ms inst-ms)
      (set-function! 'inst? inst?)
      (set-function! 'int int)
      (set-function! 'int? int?)
      (set-function! 'integer? integer?)
      (set-function! 'interleave interleave)
      (set-function! 'interpose interpose)
      (set-function! 'into into)
      ;; TODO: juxt
      ;; TODO: keep
      ;; TODO: keep-indexed
      (set-function! 'key key)
      (set-function! 'keys keys)
      (set-function! 'keyword keyword)
      (set-function! 'keyword? keyword?)
      (set-function! 'last last)
      (set-function! 'list list)
      (set-function! 'list? list)
      (set-function! 'long long)
      
      ;; TODO: map
      (set-function! 'map map)
      ;; TODO: map-indexed
      (set-function! 'map? map?)
      ;; TODO: mapcat
      ;; TODO: mapv
      (set-function! 'max max)
      (set-function! 'max-key max-key)
      ;; TODO: memoize
      (set-function! 'merge merge)
      (set-function! 'merge-with merge-with)
      (set-function! 'min min)
      (set-function! 'min-key min-key)
      (set-function! 'mod mod)
      (set-function! 'name name)
      (set-function! 'nat-int? nat-int?)
      (set-function! 'neg-int? neg-int?)
      (set-function! 'neg? neg?)
      (set-function! 'newline newline)
      (set-function! 'next next)
      (set-function! 'nfirst nfirst)
      (set-function! 'nil? nil?)
      (set-function! 'nnext nnext)
      ;; TODO: not-any?
      (set-function! 'not-empty not-empty)
      ;; TODO: not-every?
      (set-function! 'nth nth)
      (set-function! 'nthnext nthnext)
      (set-function! 'nthrest nthrest)
      #?(:clj (set-function! 'num num))
      (set-function! 'number? number?)
      #?(:clj (set-function! 'numerator numerator))
      (set-function! 'odd? odd?)
      ;; TODO: partial
      (set-function! 'partition partition)
      (set-function! 'partition-all partition-all)
      ;; TODO: partition-by
      (set-function! 'peek peek)
      (set-function! 'pop pop)
      (set-function! 'pos-int? pos-int?)
      (set-function! 'pos? pos?)
      (set-function! 'pr pr)
      (set-function! 'pr-str pr-str)
      (set-function! 'print print)
      (set-function! 'print-str print-str)
      #?(:clj (set-function! 'printf printf))
      (set-function! 'println println)
      (set-function! 'println-str println-str)
      (set-function! 'prn prn)
      (set-function! 'prn-str prn-str)
      (set-function! 'quot quot)
      (set-function! 'rand rand)
      (set-function! 'rand-int rand-int)
      (set-function! 'rand-nth rand-nth)
      (set-function! 'random-sample random-sample)
      (set-function! 'range range)
      #?(:clj (set-function! 'ratio? ratio?))
      #?(:clj (set-function! 'rational? rational?))
      #?(:clj (set-function! 'rationalize rationalize))
      (set-function! 're-find re-find)
      #?(:clj (set-function! 're-groups re-groups))
      #?(:clj (set-function! 're-matcher re-matcher))
      (set-function! 're-matches re-matches)
      (set-function! 're-pattern re-pattern)
      (set-function! 'regex re-pattern)
      (set-function! 're-seq re-seq)
      ;; TODO: reduce
      (set-function! 'repeat repeat)
      (set-function! 'rem rem)
      (set-function! 'remove remove)
      ;; TODO: repeatedly
      (set-function! 'replace replace)
      (set-function! 'reset! reset!)
      (set-function! 'rest rest)
      (set-function! 'reverse reverse)
      (set-function! 'reversible? reversible?)
      (set-function! 'rseq rseq)
      (set-function! 'second second)
      (set-function! 'select-keys select-keys)
      (set-function! 'seq seq)
      (set-function! 'seq? seq?)
      (set-function! 'seqable? seqable?)
      #?(:clj (set-function! 'seque seque))
      (set-function! 'sequence sequence)
      (set-function! 'sequential? sequential?)
      (set-function! 'set set)
      (set-function! 'set? set?)
      (set-function! 'short short)
      (set-function! 'shuffle shuffle)
      #?(:clj (set-function! 'slurp slurp))
      ;; TODO: some
      (set-function! 'some? some?)
      ;; TODO: sort
      ;; TODO: sort-by
      (set-function! 'sorted-map sorted-map)
      ;; TODO: sorted-map-by
      (set-function! 'sorted-set sorted-set)
      ;; TODO: sorted-set-by
      (set-function! 'sorted? sorted?)
      #?(:clj (set-function! 'spit spit))
      (set-function! 'split-at split-at)
      ;; TODO: split-with
      (set-function! 'str str)
      (set-function! 'string? string?)
      (set-function! 'subs subs)
      (set-function! 'subvec subvec)
      ;; TODO: swap!
      (set-function! 'symbol symbol)
      (set-function! 'symbol? symbol?)
      (set-function! 'take take)
      (set-function! 'take-last take-last)
      (set-function! 'take-nth take-nth)
      ;; TODO: take-while
      (set-function! 'true? true?)
      (set-function! 'type type)
      ;; TODO: update
      ;; TODO: update-in
      (set-function! 'uri? uri?)
      (set-function! 'uuid? uuid?)
      (set-function! 'val val)
      (set-function! 'vals vals)
      (set-function! 'vec vec)
      (set-function! 'vector vector)
      (set-function! 'vector? vector?)
      (set-function! 'zero? zero?)
      (set-function! 'zipmap zipmap)))
  
