package Others;

import Images.ImageFactory;

import javax.swing.*;

import java.util.Objects;

import static Images.GameImages.SOUND;


public class Sound extends JButton {
    public Sound() {
        initialize();
    }

    private void initialize() {
        this.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(SOUND))));
    }
}
