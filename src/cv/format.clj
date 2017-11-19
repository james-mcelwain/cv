(ns cv.format)

(def x1-41000-16bit
  (let [sample-rate 44100
        sample-size 16
        channels 1
        signed true
        big-endian false]
    (javax.sound.sampled.AudioFormat. sample-rate sample-size channels signed big-endian)))

(def x4-44100-16bit
  (let [sample-rate 44100
        sample-size 16
        channels 4
        signed true
        big-endian false]
    (javax.sound.sampled.AudioFormat. sample-rate sample-size channels signed big-endian)))

(def x4-88200-16bit
  (let [sample-rate 88200
        sample-size 16
        channels 4
        signed true
        big-endian false]
    (javax.sound.sampled.AudioFormat. sample-rate sample-size channels signed big-endian)))


(def x4-96000-16bit
  (let [sample-rate 96000
        sample-size 16
        channels 4
        signed true
        big-endian false]
    (javax.sound.sampled.AudioFormat. sample-rate sample-size channels signed big-endian)))
