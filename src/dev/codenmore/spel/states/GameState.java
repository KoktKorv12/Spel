package dev.codenmore.spel.states;


import dec.codenmore.spel.Game;
import dec.codenmore.spel.worlds.World;
import dev.codenmore.spel.entities.creature.Player;

import java.awt.*;

public class GameState  extends State{

    private Player player;
    private World world;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
        world = new World(game, "res/world/world1.txt");
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
