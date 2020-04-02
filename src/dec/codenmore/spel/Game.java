package dec.codenmore.spel;

import dev.codenmore.spel.Display;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {

    private Display display;
    public int width, height;
    public String title;

    private boolean running;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //sätter height på "Game"
    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

    }

    //Grafiker
    private void init(){
        display = new Display(title ,width, height);
    }

    private void tick(){

    }

    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //Rita här

        g.fillRect(0, 0, width, height);


        //Avsluta ritning
        bs.show();
        g.dispose();
    }

    public void run(){

        init();

        while(running){
            tick();
            render();
        }

        stop();

    }

    //startar thread
    public synchronized void start(){
        if(running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    //stoppar thread
    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
