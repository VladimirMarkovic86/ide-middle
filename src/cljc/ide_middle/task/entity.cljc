(ns ide-middle.task.entity)

(def type-bug "bug")

(def type-new-functionality "new_functionality")

(def type-refactoring "refactoring")

(def priority-low "low")

(def priority-medium "medium")

(def priority-high "high")

(def difficulty-easy "easy")

(def difficulty-medium "medium")

(def difficulty-hard "hard")

(def status-open "open")

(def status-development "development")

(def status-deployed "deployed")

(def status-testing "testing")

(def status-rejected "rejected")

(def status-done "done")

(def table-rows-a
     (atom 10))

(def card-columns-a
     (atom 0))

(def preferences
     {:table-rows-a table-rows-a
      :card-columns-a card-columns-a})

(defn calculate-rows
  "Calculates rows for table/card view"
  []
  (if (= (int
           @card-columns-a)
         0)
    @table-rows-a
    (* @table-rows-a
       @card-columns-a))
 )

