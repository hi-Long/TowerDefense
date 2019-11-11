package Bullet;

import Constants.Constants;
import Enemy.Enemy;
import Images.GameImages;
import Images.ImageFactory;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

import Models.ObjectsModel;
import Tower.Tower;

public class Bullet extends ObjectsModel {

    private BulletType bulletType;
    private Tower tower;
    private BufferedImage bulletImage;
    private BufferedImage bulletExplosionImage;
    private int burstRange;

    public Bullet(int x, int y, Tower tower) {
        this.x = x;
        this.y = y;
        this.tower = tower;
        initialize();
    }

    public boolean hitTarget() {
        Point bulletPoint = new Point(this.getX(), this.getY());
        Point targetPoint = new Point(this.getTarget().getX(), this.getTarget().getY());
        return (Math.abs(bulletPoint.distance(targetPoint)) <= 5);
    }

    public void burst(List<Enemy> objects) {
        Point bulletPoint = new Point(this.getX(), this.getY());
        for (int i = 0; i < objects.size() - 1; i ++) {
            Enemy object = objects.get(i);
            Point objectPoint = new Point(object.getX(), object.getY());
            Enemy nextObject = objects.get(i + 1);
            Point nextObjectPoint = new Point(nextObject.getX(), nextObject.getY());
            if (bulletPoint.distance(objectPoint) <= this.getRange()) {
                object.setHealth(object.getHealth() - this.getDamage());
            }
            if (bulletPoint.distance(objectPoint) <= this.getRange() && bulletPoint.distance(nextObjectPoint) > this.getRange()) {
                break;
            }
        }
        this.setIsDead(true);
    }

    public void move() {

        int x1 = this.getX();
        int y1 = this.getY();
        int x2 = this.getTarget().getX();
        int y2 = this.getTarget().getY();

        double angleOfBulletInRadians = Math.atan2(y2 - y1, x2 - x1);

        this.setX((int)(x1 + Constants.BULLET_SPEED * Math.cos(angleOfBulletInRadians)));
        this.setY((int)(y1 + Constants.BULLET_SPEED * Math.sin(angleOfBulletInRadians)));

    }

    @Override
    protected void initialize() {
        setBulletType();
        setBulletImage();
        final Enemy target = this.tower.getTarget();
        this.setTarget(target);
        this.setDamage(tower.getDamage());
    }


    public void setBulletType() {
        switch (tower.getTowerType()) {
            case QUICK_TOWER:
                this.setImage(ImageFactory.createImage(GameImages.QUICK_TOWER_BULLET));
                bulletType = BulletType.QuickTowerBullet;
                this.setRange(10);
            case NORMAL_TOWER:
                this.setImage(ImageFactory.createImage(GameImages.NORMAL_TOWER_BULLET));
                bulletType = BulletType.NormalTowerBullet;
                this.setRange(20);
            case SLOW_TOWER:
                this.setImage(ImageFactory.createImage(GameImages.SLOW_TOWER_BULLET));
                bulletType = BulletType.SlowTowerBullet;
                this.setRange(30);
        }
    }

    public BulletType getBulletType() {
        return this.bulletType;
    }

    public void setBulletImage() {
        switch (bulletType) {
            case QuickTowerBullet:
                this.setImage(ImageFactory.createImage(GameImages.QUICK_TOWER_BULLET));
                break;
            case NormalTowerBullet:
                this.setImage(ImageFactory.createImage(GameImages.NORMAL_TOWER_BULLET));
                break;
            case SlowTowerBullet:
                this.setImage(ImageFactory.createImage(GameImages.SLOW_TOWER_BULLET));
                break;
        }
    }
}
