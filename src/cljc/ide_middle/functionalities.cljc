(ns ide-middle.functionalities
  (:require [common-middle.functionalities :as fns]))

(def project-create
     "project-create")

(def project-read
     "project-read")

(def project-update
     "project-update")

(def project-delete
     "project-delete")

(def task-create
     "task-create")

(def task-read
     "task-read")

(def task-update
     "task-update")

(def task-delete
     "task-delete")

(def read-file
     "read-file")

(def execute-shell-command
     "execute-shell-command")

(def list-documents
     "list-documents")

(def new-folder
     "new-folder")

(def new-file
     "new-file")

(def move-document
     "move-document")

(def copy-document
     "copy-document")

(def delete-document
     "delete-document")

(def build-project
     "build-project")

(def build-uberjar
     "build-uberjar")

(def build-project-dependencies
     "build-project-dependencies")

(def clean-project
     "clean-project")

(def run-project
     "run-project")

(def git-project
     "git-project")

(def git-status
     "git-status")

(def git-diff
     "git-diff")

(def git-log
     "git-log")

(def git-unpushed
     "git-unpushed")

(def git-commit-push
     "git-commit-push")

(def git-file-change-state
     "git-file-change-state")

(def git-commit-push-action
     "git-commit-push-action")

(def save-file-changes
     "save-file-changes")

(def versioning-project
     "versioning-project")

(def find-text-in-files
     "find-text-in-files")

(def projects-tree
     "projects-tree")

(def functionalities
     (conj
       fns/functionalities
       project-create
       project-read
       project-update
       project-delete
       task-create
       task-read
       task-update
       task-delete
       read-file
       execute-shell-command
       list-documents
       new-folder
       new-file
       move-document
       copy-document
       delete-document
       build-project
       build-uberjar
       build-project-dependencies
       clean-project
       run-project
       git-project
       git-status
       git-diff
       git-log
       git-unpushed
       git-commit-push
       git-file-change-state
       git-commit-push-action
       save-file-changes
       versioning-project
       find-text-in-files
       projects-tree))

