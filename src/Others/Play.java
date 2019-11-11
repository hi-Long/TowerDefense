package Others;

import Images.ImageFactory;

import javax.swing.*;

import java.util.Objects;

import static Images.GameImages.PLAY;

public class Play extends JButton {
    public Play() {
        initialize();
    }
    public void initialize() {
        this.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(PLAY))));
    }
}
