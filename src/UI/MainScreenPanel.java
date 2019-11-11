package UI;

import Constants.Constants;
import Images.ImageFactory;
import Others.Play;
import Others.Setting;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static Images.GameImages.BACKGROUND;

/*
public class MainScreenPanel extends JPanel implements ActionListener {

    private JButton Setting;
    private JButton Play;

    private BufferedImage Background;
    private int dx1, dy1, dx2, dy2;
    private int srcx1, srcy1, srcx2, srcy2;

    private Timer timer;

    public MainScreenPanel() {
        initializeVariables();
        initializeLayout();
    }

    public void initializeVariables() {
        this.setLayout(null);
        initImages();
        initImagePoints();

        this.Setting = new Setting();
        this.Setting.setBounds(0, 0, Constants.boxSize, Constants.boxSize);
        this.Setting.setContentAreaFilled(false);
        this.Setting.setEnabled(true);
        this.Setting.setVisible(true);

        this.Play = new Play();
        this.Play.setBounds(0, Constants.boxSize, Constants.boxSize, Constants.boxSize);
        this.Play.setContentAreaFilled(false);
        this.Play.setEnabled(true);
        this.Play.setVisible(true);

        timer = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveBackground();
                repaint();
            }
        });

        this.add(Setting);
        this.add(Play);

    }

    private void initImages() {
        try {
            Background = ImageIO.read(new File("D:\\TowerDefense\\asset_2\\Main Screen Panel Images\\MovingBackground.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.drawImage(this.Background, dx1, dy1, dx2, dy2, srcx1, srcy1,
                srcx2, srcy2, this);
    }

    private void initializeLayout() {
        setPreferredSize(new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT));
    }

    private void initImagePoints() {
        dx1 = 0;
        dy1 = 0;
        dx2 = Constants.FRAME_WIDTH;
        dy2 = Constants.FRAME_HEIGHT;
        srcx1 = 0;
        srcy1 = 0;
        srcx2 = Constants.FRAME_WIDTH;
        srcy2 = Constants.FRAME_HEIGHT;
    }

    private void moveBackground() {
        if (srcx1 > this.Background.getWidth()) {
            srcx1 = 0 - Constants.FRAME_WIDTH;
            srcx2 = 0;
        } else {
            srcx1 += 10;
            srcx2 += 10;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
*/

public class MainScreenPanel extends JPanel {
    private static final int INCREMENT = 10;

    private BufferedImage backgroundImage;
    private Image runnerImage;

    private int dx1, dy1, dx2, dy2;
    private int srcx1, srcy1, srcx2, srcy2;
    private int IMAGE_WIDTH;

    public MainScreenPanel() {
        initImages();
        initImagePoints();
        Timer timer = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveBackground();
                repaint();
            }
        });
        timer.start();

        FlowLayout layout = (FlowLayout)getLayout();
        layout.setHgap(0);
        layout.setVgap(0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(backgroundImage, dx1, dy1, dx2, dy2, srcx1, srcy1,
                srcx2, srcy2, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
    }

    private void initImagePoints() {
        dx1 = 0;
        dy1 = 0;
        dx2 = Constants.FRAME_WIDTH;
        dy2 = Constants.FRAME_HEIGHT;
        srcx1 = 0;
        srcy1 = 0;
        srcx2 = Constants.FRAME_WIDTH;
        srcy2 = Constants.FRAME_HEIGHT;
    }

    private void initImages() {
        try {
            backgroundImage = ImageIO.read(new File("D:\\TowerDefense\\asset_2\\Main Screen Panel Images\\MovingBackground.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void moveBackground() {
        if (srcx1 > this.backgroundImage.getWidth()) {
            srcx1 = 0 - Constants.FRAME_WIDTH;
            srcx2 = 0;
        }
        else {
            srcx1 += 10;
            srcx2 += 10;
        }
    }
}

