package Enemy;

import Constants.Constants;
import Images.ImageFactory;

import Enemy.EnemyType;
import static Images.GameImages.QUICK_ENEMY;

public class QuickEnemy extends Enemy {
    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(QUICK_ENEMY));
        this.setEnemyType(EnemyType.QUICK);
        this.setHealth(Constants.QUICK_ENEMY_HEALTH);
        this.setSpeed(Constants.QUICK_ENEMY_SPEED);
        this.setDamage(Constants.QUICK_ENEMY_DAMAGE);
        this.setArmor(Constants.QUICK_ENEMY_ARMOR);
        this.setBounty(Constants.QUICK_ENEMY_BOUNTY);
    }

}
