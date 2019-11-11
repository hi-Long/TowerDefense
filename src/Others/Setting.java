package Others;

import Images.ImageFactory;

import javax.swing.*;

import java.util.Objects;

import static Images.GameImages.SETTING;


public class Setting extends JButton {
    public Setting () {
        initialize();
    }

    private void initialize() {
        this.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(SETTING))));
    }
}
