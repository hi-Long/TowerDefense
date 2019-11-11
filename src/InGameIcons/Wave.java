package InGameIcons;

import Constants.Constants;
import Images.ImageFactory;
import Models.Sprite;

import static Images.GameImages.WAVE;

public class Wave extends Sprite {
    public Wave() {
        initialize();
    }

    private void initialize() {
        this.setImage(ImageFactory.createImage(WAVE));
        this.setX(0);
        this.setY(Constants.boxSize);
    }
}
