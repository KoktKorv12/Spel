package dev.codenmore.spel;

import dec.codenmore.spel.Game;


public class Launcher {

    //startar spelet "Launcher"
    public static void main(String[] args) {
        Game game = new Game("Speltitel", 900,900);
        game.start();

    }
}
