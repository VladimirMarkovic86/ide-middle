(ns ide-middle.project.entity)

(def clojure "clojure")

(def clojure-script "clojure_script")

(def clojurescript "clojurescript")

(def application "application")

(def library "library")

(def start "start")

(def stop "stop")

(def restart "restart")

(def status "status")

(def git-status "git-status")

(def git-init "git-init")

(def git-remote-change "git-remote-change")

(def git-add "git-add")

(def git-rm "git-rm")

(def git-reset "git-reset")

(def git-commit "git-commit")

(def git-commit-push "git-commit-push")

(def git-push "git-push")

(def git-diff "git-diff")

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

