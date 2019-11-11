package Others;

import Images.ImageFactory;

import javax.swing.*;

import java.util.Objects;

import static Images.GameImages.GUIDE;


public class Guide extends JButton {
    public Guide() {
        initialize();
    }

    private void initialize() {
        this.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(GUIDE))));
    }
}
