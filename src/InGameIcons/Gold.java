package InGameIcons;

import Constants.Constants;
import Images.ImageFactory;
import Models.Sprite;

import static Images.GameImages.GOLD;

public class Gold extends Sprite {
    public Gold() {
        initialize();
    }
    private void initialize() {
        this.setImage(ImageFactory.createImage(GOLD));
        this.setX(Constants.boxSize * 2);
        this.setY(0);
    }
}
