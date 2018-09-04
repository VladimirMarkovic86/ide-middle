(ns ide-middle.functionalities
  (:require [common-middle.functionalities :as fns]))

(def project-create "project-create")

(def project-read "project-read")

(def project-update "project-update")

(def project-delete "project-delete")

(def read-file "read-file")

(def execute-shell-command "execute-shell-command")

(def list-documents "list-documents")

(def new-folder "new-folder")

(def new-file "new-file")

(def move-document "move-document")

(def copy-document "copy-document")

(def delete-document "delete-document")

(def build-project "build-project")

(def build-project-dependencies "build-project-dependencies")

(def clean-project "clean-project")

(def run-project "run-project")

(def git-project "git-project")

(def git-status "git-status")

(def save-file-changes "save-file-changes")

(def functionalities
     (conj
       fns/functionalities
       project-create
       project-read
       project-update
       project-delete
       read-file
       execute-shell-command
       list-documents
       new-folder
       new-file
       move-document
       copy-document
       delete-document
       build-project
       build-project-dependencies
       clean-project
       run-project
       git-project
       git-status
       save-file-changes))

