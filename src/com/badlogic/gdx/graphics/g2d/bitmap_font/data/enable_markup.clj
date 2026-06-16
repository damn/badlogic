(ns com.badlogic.gdx.graphics.g2d.bitmap-font.data.enable-markup
  (:import (com.badlogic.gdx.graphics.g2d BitmapFont$BitmapFontData)))

(defn enable-markup! [^BitmapFont$BitmapFontDat data]
  (set! (.markupEnabled data) true))
