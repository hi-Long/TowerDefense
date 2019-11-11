package Enemy;

import Constants.Constants;
import Images.ImageFactory;

import Enemy.EnemyType;

import static Images.GameImages.NORMAL_ENEMY;

public class NormalEnemy extends Enemy {
    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(NORMAL_ENEMY));
        this.setEnemyType(EnemyType.NORMAL);
        this.setHealth(Constants.NORMAL_ENEMY_HEALTH);
        this.setSpeed(Constants.NORMAL_ENEMY_SPEED);
        this.setDamage(Constants.NORMAL_ENEMY_DAMAGE);
        this.setArmor(Constants.NORMAL_ENEMY_ARMOR);
        this.setBounty(Constants.NORMAL_ENEMY_BOUNTY);
    }

}
