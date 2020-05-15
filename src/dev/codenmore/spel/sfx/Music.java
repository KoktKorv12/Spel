package dev.codenmore.spel.sfx;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {


    public static void main(String[] args) {
        Music m =  new Music();
        m.play("BackgroundMusic.wav");
    }


    public void play(String filename) {
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                new File(filename));
                clip.open(inputStream);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

}
