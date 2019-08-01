(ns ide-middle.functionalities-by-url
  (:require [ide-middle.functionalities :as imfns]
            [ide-middle.request-urls :as imrurls]
            [common-middle.functionalities-by-url :as fns-by-url]))

(defn bind-specific-functionalities-by-url
  "Adds specific CRUD functionalities beside the common ones"
  []
  (swap!
    fns-by-url/read-functionalities
    conj
    imfns/project-read
    imfns/task-read)
  (swap!
    fns-by-url/update-functionalities
    conj
    imfns/project-update
    imfns/task-update)
  (swap!
    fns-by-url/create-functionalities
    conj
    imfns/project-create
    imfns/task-create)
  (swap!
    fns-by-url/delete-functionalities
    conj
    imfns/project-delete
    imfns/task-delete))

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/read-file-url
  [url]
  imfns/read-file)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/execute-shell-command-url
  [url]
  imfns/execute-shell-command)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/list-documents-url
  [url]
  imfns/list-documents)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/new-folder-url
  [url]
  imfns/new-folder)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/new-file-url
  [url]
  imfns/new-file)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/move-document-url
  [url]
  imfns/move-document)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/copy-document-url
  [url]
  imfns/copy-document)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/delete-document-url
  [url]
  imfns/delete-document)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/build-project-url
  [url]
  imfns/build-project)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/build-uberjar-url
  [url]
  imfns/build-uberjar)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/clean-project-url
  [url]
  imfns/clean-project)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/run-project-url
  [url]
  imfns/run-project)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-project-url
  [url]
  imfns/git-project)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-status-url
  [url]
  imfns/git-status)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-diff-url
  [url]
  imfns/git-diff)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-log-url
  [url]
  imfns/git-log)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-unpushed-url
  [url]
  imfns/git-unpushed)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-commit-push-url
  [url]
  imfns/git-commit-push)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-file-change-state-url
  [url]
  imfns/git-file-change-state)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/git-commit-push-action-url
  [url]
  imfns/git-commit-push-action)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/save-file-changes-url
  [url]
  imfns/save-file-changes)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/versioning-project-url
  [url]
  imfns/versioning-project)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/upgrade-versions-url
  [url]
  imfns/upgrade-versions)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/upgrade-versions-save-url
  [url]
  imfns/upgrade-versions-save)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/upgrade-versions-build-url
  [url]
  imfns/upgrade-versions-build)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/find-text-in-files-url
  [url]
  imfns/find-text-in-files)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/projects-tree-url
  [url]
  imfns/projects-tree)

(defmethod fns-by-url/get-functionalities-by-url
  imrurls/video-url
  [url]
  imfns/list-documents)

