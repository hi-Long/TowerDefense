package Enemy;

import Constants.Constants;
import Images.ImageFactory;

import Enemy.EnemyType;
import static Images.GameImages.QUICK_ENEMY;

public class WeekEnemy extends Enemy {

    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(QUICK_ENEMY));
        this.setEnemyType(EnemyType.WEEK);
        this.setHealth(Constants.WEEK_ENEMY_HEALTH);
        this.setSpeed(Constants.WEEK_ENEMY_SPEED);
        this.setDamage(Constants.WEEK_ENEMY_DAMAGE);
        this.setArmor(Constants.WEEK_ENEMY_ARMOR);
        this.setBounty(Constants.WEEK_ENEMY_BOUNTY);
    }

}
