package Models;

import java.awt.image.BufferedImage;

public abstract class Sprite {

    private BufferedImage image;
    protected int x, y;

    // getter, setter
    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage img) {
        this.image = img;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
