package dev.codenmore.spel.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage dirt, grass, stone, tree;
    public static BufferedImage[] player_down;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/SPRITESHEET.png"));

        player_down = new BufferedImage[2];

        player_down[0] = sheet.crop();
        player_down[1] = sheet.crop();

        grass = sheet.crop(width,0, width, height);
        dirt = sheet.crop(width * 2,0, width, height);
        stone = sheet.crop(width * 3,0, width, height);
        tree = sheet.crop(0,height, width, height);

    }
}
