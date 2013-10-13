(defproject quil "2.0.0.dev"
  :description "(mix Processing Clojure)"
  :url "http://github.com/iamedu/quil"
  :mailing-list {:name "Quil Mailing List"
                 :archive "https://groups.google.com/forum/?fromgroups#!forum/clj-processing"
                 :post "clj-processing@googlegroups.com"}
  :license {:name "Common Public License - v 1.0"
            :url "http://www.opensource.org/licenses/cpl1.0"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.jogamp.jogl/jogl-all "2.0.2"]
                 [org.jogamp.gluegen/gluegen "2.0.2"]
                 [processing/core "2.0.3"]]
  :aot [quil.applet])
