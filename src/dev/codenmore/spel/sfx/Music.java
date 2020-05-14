package dev.codenmore.spel.sfx;

import com.sun.tools.javac.Main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {

  new Thread(new Runnable() {
        public void run() {
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                        Main.class.getResourceAsStream("BackgroundMusic.wav"));
                clip.open(inputStream);
                clip.start();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
