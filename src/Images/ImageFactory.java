package Images;

import javax.imageio.ImageIO;

import Constants.Constants;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFactory {

    public static BufferedImage createImage(GameImages image) {
        BufferedImage bufferedImage = null;
        switch (image) {
            case BACKGROUND:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.BACKGROUND_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case SETTING:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.SETTING_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case SOUND:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.SOUND_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GUIDE:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.GUIDE_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case PLAY:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.PLAY_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case QUIT:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.QUIT_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case PAUSE:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.PAUSE_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            //--------------------------------------------------//\
            case UPGRADE:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.UPGRADE_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case DESTROY:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.DESTROY_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            //--------------------------------------------------//
            case QUICK_ENEMY:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.QUICK_ENEMY_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case WEEK_ENEMY:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.WEEK_ENEMY_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case NORMAL_ENEMY:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.NORMAL_ENEMY_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case TANK:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.TANK_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case TANK_GUN:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.TANK_GUN_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case PLANE:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.PLANE_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            //--------------------------------------------------//
            case GOLD:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.GOLD_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case LIFE:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.LIFE_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case WAVE:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.WAVE_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            //-------------------------------------------------//
            case QUICK_TOWER_LV1:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.QUICK_TOWER_LV1_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case NORMAL_TOWER_LV1:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.NORMAL_TOWER_LV1_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case SLOW_TOWER_LV1:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.SLOW_TOWER_LV1_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case QUICK_TOWER_LV2:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.QUICK_TOWER_LV2_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case NORMAL_TOWER_LV2:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.NORMAL_TOWER_LV2_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case SLOW_TOWER_LV2:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.SLOW_TOWER_LV2_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case NORMAL_TOWER_BULLET:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.NORMAL_TOWER_BULLET_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case QUICK_TOWER_BULLET:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.QUICK_TOWER_BULLET_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case SLOW_TOWER_BULLET:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.SLOW_TOWER_BULLET_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case QUICK_TOWER_BULLET_EXPLOSION:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.QUICK_TOWER_BULLET_EXPLOSION_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case NORMAL_TOWER_BULLET_EXPLOSION:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.NORMAL_TOWER_BULLET_EXPLOSION_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case SLOW_TOWER_BULLET_EXPLOSION:
                try {
                    bufferedImage = ImageIO.read(new File(Constants.SLOW_TOWER_BULLET_EXPLOSION_URL));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                return null;
        }
        return toCompatibleImage(bufferedImage);
    }

    private static BufferedImage toCompatibleImage(BufferedImage image) {
        // obtain the current system graphical settings
        GraphicsConfiguration gfxConfig = GraphicsEnvironment.
                getLocalGraphicsEnvironment().getDefaultScreenDevice().
                getDefaultConfiguration();

        /*
         * if image is already compatible and optimized for current system
         * settings, simply return it
         */
        if (image.getColorModel().equals(gfxConfig.getColorModel()))
            return image;

        // image is not optimized, so create a new image that is
        BufferedImage newImage = gfxConfig.createCompatibleImage(
                image.getWidth(), image.getHeight(), image.getTransparency());

        // get the graphics context of the new image to draw the old image on
        Graphics2D g2d = newImage.createGraphics();

        // actually draw the image and dispose of context no longer needed
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();

        // return the new optimized image
        return newImage;
    }
}
