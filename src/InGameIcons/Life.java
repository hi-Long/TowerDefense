package InGameIcons;

import Images.ImageFactory;
import Models.Sprite;

import static Images.GameImages.LIFE;

public class Life extends Sprite {
    public Life() {
        initialize();
    }

    private void initialize() {
        this.setImage(ImageFactory.createImage(LIFE));
        this.setX(0);
        this.setY(0);
    }
}
