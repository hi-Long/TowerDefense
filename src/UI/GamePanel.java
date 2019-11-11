package UI;

import Constants.Constants;
import Enemy.*;
import Images.ImageFactory;
import InGameIcons.Gold;
import InGameIcons.Life;
import InGameIcons.Pause;
import InGameIcons.Wave;
import Models.ObjectsModel;
import Bullet.Bullet;
import Enemy.Enemy;
import Tower.Tower;
import Others.*;
import Tower.TowerBox;

import java.awt.geom.AffineTransform;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

import static Images.GameImages.BACKGROUND;

public class GamePanel extends JPanel {

    private java.awt.image.BufferedImage backgroundImage;

    private Font font;
    private Timer timer;
    boolean inGame = true;

    private List<Enemy> enemyList;
    private TowerBox[] towers;

    private long lastSpawnWeek = System.currentTimeMillis();
    private long lastSpawnQuick = System.currentTimeMillis();
    private long lastSpawnNormal = System.currentTimeMillis();
    private long lastSpawnTank = System.currentTimeMillis();
    private long lastSpawnPlane = System.currentTimeMillis();

    private int gold = 500;
    private int life = 7;
    private int wave = 0;

    private Choices choices;

    public GamePanel() {
        initializeVariables();
        initializeLayout();
    }

    private void initializeVariables() {
        this.setLayout(null);

        font = new Font("Comic Sans MS", Font.BOLD, 12);

        enemyList = new LinkedList<>();

        choices = new Choices(this.getGold());
        this.add(choices);

        towers = new TowerBox[12];
        for (int i = 0; i < 12; i ++) {
            towers[i] = new TowerBox((int)Constants.towerLocation[i].getX(), (int)Constants.towerLocation[i].getY(), choices);
            this.add(towers[i]);
        }

        backgroundImage = ImageFactory.createImage(BACKGROUND);

        timer = new Timer(Constants.GAME_SPEED, new GameLoop(this));

        timer.start();
    }

    private void initializeLayout() {
        setPreferredSize(new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        g2.setFont(font);

        drawBackground(g);

        drawObjects(g);

    }

    //----------------------------------------------------------------------------------------------//
    /*
    private void drawSettingIcon(Graphics2D g2) {
        g2.drawImage(new Setting().getImage(), new Setting().getX(), new Setting().getY(), this);
    }

    private void drawGuideIcon(Graphics2D g2) {
        g2.drawImage(new Guide().getImage(), new Guide().getX(), new Guide().getY(), this);
    }

    private void drawSoundIcon(Graphics2D g2) {
        g2.drawImage(new Sound().getImage(), new Sound().getX(), new Sound().getY(), this);
    }

    private void drawPlayIcon(Graphics2D g2) {
        g2.drawImage(new Play().getImage(), new Play().getX(), new Play().getY(), this);
    }

     */
    //Draw in-game icons  ----------------------------------------------------------------------------------------------//
    private void drawGoldIcon(Graphics2D g2) {
        g2.drawImage(new Gold().getImage(), new Gold().getX(), new Gold().getY(), this);
        g2.drawString("   " + gold, Constants.boxSize * 3, Constants.boxSize / 2);
        repaint();
    }

    private void drawLifeIcon(Graphics2D g2) {
        g2.drawImage(new Life().getImage(), new Life().getX(), new Life().getY(), this);
        g2.drawString("   " + life, Constants.boxSize, Constants.boxSize / 2);
        repaint();
    }

    private void drawWaveIcon(Graphics2D g2) {
        g2.drawImage(new Wave().getImage(), new Wave().getX(), new Wave().getY(), this);
        g2.drawString("   " + wave, Constants.boxSize, Constants.boxSize * 3 / 2);
        repaint();
    }

    private void drawPauseIcon(Graphics2D g2) {
        g2.drawImage(new Pause().getImage(), new Pause().getX(), new Pause().getY(), this);
    }
    //draw in-game objects----------------------------------------------------------------------------------------------//
    private void drawObject (Graphics2D g2, ObjectsModel objectsModel, double rotateAngle) {
        int tx = objectsModel.getImage().getWidth() / 2;
        int ty = objectsModel.getImage().getHeight() / 2;
        AffineTransform oldAT = g2.getTransform();
        g2.translate(tx + objectsModel.getX(), ty + objectsModel.getY());
        g2.rotate(rotateAngle);
        g2.translate(-tx, -ty);
        g2.drawImage(objectsModel.getImage(), 0, 0, this);
        g2.setTransform(oldAT);
        repaint();
    }

    private void drawEnemy(Graphics2D g2, Enemy enemy) {
        if (!enemy.isDead()) {
            double rotateAngle = enemy.getDirection().getDegree();
            drawObject(g2, enemy, rotateAngle);
        }
    }

    private void drawTower(Graphics2D g2, TowerBox towerBox) {
        Tower tower = towerBox.getTower();
        if (tower != null) {
            double rotateAngle = tower.getRotationAngleInDegrees() + Math.PI / 2;
            drawObject(g2, tower, rotateAngle);
        }
    }

    private void drawBullet(Graphics2D g2, Bullet bullet) {
        if (!bullet.getTarget().isDead()) {
            double rotateAngle = bullet.getRotationAngleInDegrees() + Math.PI / 2;
            drawObject(g2, bullet, rotateAngle);
        }
    }

    //----------------------------------------------------------------------------------------------//
    private void drawBackground(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(backgroundImage, 0, 0, this);
        drawGoldIcon(g2);
        drawLifeIcon(g2);
        drawWaveIcon(g2);
    }

    private void drawObjects(Graphics g) {
        if (inGame) {

            for (Enemy enemy : enemyList) {
                drawEnemy((Graphics2D) g, enemy);
            }

            for (TowerBox towerBox : towers) {
                Tower tower = towerBox.getTower();
                if (tower != null) {
                    drawTower((Graphics2D) g, towerBox);
                    if (!tower.getBulletsList().isEmpty()) {
                        for (Bullet bullet : tower.getBulletsList()) {
                            drawBullet((Graphics2D) g, bullet);
                        }
                    }
                }
            }

        }
        else {
            if (timer.isRunning()) {
                timer.stop();
            }
        }
        Toolkit.getDefaultToolkit().sync();
    }

    // update all statuses
    public boolean canSpawn(long lastSpawnTime, long spawnTime) {
        return ((System.currentTimeMillis() - lastSpawnTime) / 1000.0 >= spawnTime);
    }

    private void enemySpawn () {
        if (canSpawn(lastSpawnQuick, Constants.QUICK_ENEMY_SPAWN_TIME)) {
            enemyList.add(new QuickEnemy());
            lastSpawnQuick = System.currentTimeMillis();
        }
        if (canSpawn(lastSpawnWeek, Constants.WEEK_ENEMY_SPAWN_TIME)) {
            enemyList.add(new WeekEnemy());
            lastSpawnWeek = System.currentTimeMillis();
        }
        if (canSpawn(lastSpawnNormal, Constants.NORMAL_ENEMY_SPAWN_TIME)) {
            enemyList.add(new NormalEnemy());
            lastSpawnNormal = System.currentTimeMillis();
        }
        if (canSpawn(lastSpawnTank, Constants.TANK_ENEMY_SPAWN_TIME)) {
            enemyList.add(new Tank());
            lastSpawnTank = System.currentTimeMillis();
        }
        if (canSpawn(lastSpawnPlane, Constants.PLANE_ENEMY_SPAWN_TIME)) {
            enemyList.add(new Plane());
            lastSpawnPlane = System.currentTimeMillis();
        }
    }

    private void update() {

        this.setGold(this.getGold() - this.choices.getGoldUsed());
        this.choices.setGoldUsed(0);
        choices.setGoldAvailable(this.getGold());

        enemySpawn();

        for (int i = 0; i < enemyList.size(); i ++) {
            Enemy enemy = enemyList.get(i);
            if (enemy.getHealth() <= 0) {
                enemy.setIsDead(true);
                gold += enemy.getBounty();
                enemyList.remove(enemy);
            }
            else {
                enemy.move();
                if (enemy.escape()) {
                    this.life -= 1;
                    enemy.setIsDead(true);
                    enemyList.remove(enemy);
                    if (life == 0) {
                        inGame = false;
                    }
                }
            }
        }

        for (int i = 0; i < towers.length; i ++) {
            Tower tower = towers[i].getTower();
            if (tower != null) {
                tower.setTarget(tower.detectTarget(enemyList));
                if (tower.getTarget() != null) {
                    tower.fire();
                    tower.bulletsMove(enemyList);
                }
            }
            towers[i].update();
        }

    }

    void doOneLoop() {
        update();
        repaint();
    }

    //Getter, setter ---------------------------------------------------------------------------------------------------//
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getWave() {
        return wave;
    }

    public void setWave(int wave) {
        this.wave = wave;
    }
}
