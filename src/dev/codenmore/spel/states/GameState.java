package dev.codenmore.spel.states;

import dec.codenmore.spel.Handler;
import dec.codenmore.spel.worlds.World;
import dev.codenmore.spel.entities.creature.Player;

import java.awt.*;

public class GameState extends State{

    private Player player;
    private World world;

    public GameState(Handler handler){
        super(handler);
        player = new Player(handler, 100, 100);
        handler.setWorld(world);
        world = new World(handler, "res/world/world1.txt");
    }

    @Override
    public void tick() {
        world.tick();
        player.tick();

    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
    }

}
