package UI;

import javax.swing.*;
import Constants.Constants;
import Images.ImageFactory;
import Images.GameImages;

public class MainFrame extends JFrame {

    public MainFrame() {
        initializeLayout();
    }

    private void initializeLayout() {
        //add(new MainScreenPanel());
        add(new GamePanel());
        setTitle(Constants.TITLE);
        setIconImage(ImageFactory.createImage(GameImages.WEEK_ENEMY));
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
}
