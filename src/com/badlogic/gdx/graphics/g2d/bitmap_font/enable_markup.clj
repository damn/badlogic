(ns com.badlogic.gdx.graphics.g2d.bitmap-font.enable-markup
  (:require [com.badlogic.gdx.graphics.g2d.bitmap-font.get-data :refer [get-data]])
  (:import (com.badlogic.gdx.graphics.g2d BitmapFont)))

(defn f! [font]
  (set! (.markupEnabled (get-data font)) true))
