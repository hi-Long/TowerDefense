package Models;

import Bullet.Bullet;
import Enemy.Enemy;
import Tower.Tower;

import java.util.List;

public abstract class CanShootObjects extends ObjectsModel {

    protected List<Bullet> bullets;

    protected long lastFireTime;

    public List<Bullet> getBulletsList() {
        return bullets;
    }

    public boolean canFire() {
        return ((System.currentTimeMillis() - lastFireTime) / 1000.0 >= this.getSpeed());
    }

    public void fire() {
        if (canFire()) {
            bullets.add(new Bullet(this.getX(), this.getY(), (Tower) this));
            lastFireTime = System.currentTimeMillis();
        }
    }

    public void bulletsMove(List<Enemy> enemyList) {
        for (int i = 0; i < bullets.size(); i ++) {
            if (bullets.get(i).getTarget() == null) {
                bullets.get(i).setIsDead(true);
                bullets.remove(bullets.get(i));
            }
            if (!bullets.isEmpty() && !bullets.get(i).isDead()) {
                bullets.get(i).move();
                if (bullets.get(i).hitTarget()) {
                    bullets.get(i).burst(enemyList);
                    bullets.remove(bullets.get(i));
                }
            }
        }
    }
}

