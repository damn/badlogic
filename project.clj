(defproject badlogic "-SNAPSHOT"
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [
                 [com.badlogicgames.gdx/gdx                   "1.14.2"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl3    "1.14.2"]
                 [com.badlogicgames.gdx/gdx-freetype          "1.14.2"]
                 [com.badlogicgames.gdx/gdx-freetype-platform "1.14.2" :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform          "1.14.2" :classifier "natives-desktop"]
                 [space.earlygrey/shapedrawer "2.6.0"]
                 [org.clojure/clojure "1.12.0"]
                 ]
  :java-source-paths ["java-src"]
  :source-paths ["src"]
  ;:resource-paths ["resources/"]
  )
