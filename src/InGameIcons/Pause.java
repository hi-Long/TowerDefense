package InGameIcons;

import Constants.Constants;
import Images.ImageFactory;
import Models.Sprite;

import static Images.GameImages.PAUSE;

public class Pause extends Sprite {
    public Pause() {
        initialize();
    }

    private void initialize() {
        this.setImage(ImageFactory.createImage(PAUSE));
        this.setX(18 * Constants.boxSize);
        this.setY(0);
    }
}
