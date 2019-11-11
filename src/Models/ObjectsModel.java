package Models;

import Enemy.Enemy;

import java.util.List;
import java.awt.*;

public abstract class ObjectsModel extends Sprite {

    private boolean isDead;

    private int health;
    private int speed;
    private int damage;
    private int range;

    private Enemy target;
    protected abstract void initialize();

    private Enemy targetEnemy;

    //------------------------------------------------------------------------------------------------------------------//
    public boolean isInRange(Enemy obj) {
        Point thisPoint = new Point(this.getX(), this.getY());
        Point objPoint = new Point(obj.getX(), obj.getY());
        return (((thisPoint.distance(objPoint)) <= this.getRange()));
    }

    public Enemy detectTarget(List<Enemy> enemyList) {
        for (int i = 0; i < enemyList.size(); i ++) {
            if (this.isInRange(enemyList.get(i))) {
                return enemyList.get(i);
            }
        }
        return null;
    }
    //------------------------------------------------------------------------------------------------------------------//
    public boolean isDead() {
        return this.isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Enemy getTarget() {
        return this.target;
    }

    public void setTarget(Enemy target) {
        this.target = target;
    }

    public double getRotationAngleInDegrees () {
        Enemy enemy = this.getTarget();
        double imageAngleRad = 0;
        if (enemy != null) {
            double dx = enemy.getX() - this.getX();
            double dy = enemy.getY() - this.getY();
            imageAngleRad = Math.atan2(dy, dx);
        }
        return imageAngleRad;
    }
}
