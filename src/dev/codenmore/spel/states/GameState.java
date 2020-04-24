package dev.codenmore.spel.states;

import dec.codenmore.spel.Handler;
import dec.codenmore.spel.worlds.World;

import java.awt.*;

public class GameState extends State{

    private World world;

    public GameState(Handler handler){
        super(handler);
        handler.setWorld(world);
        world = new World(handler, "res/world/world1.txt");
    }

    @Override
    public void tick() {
        world.tick();

    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }

}
