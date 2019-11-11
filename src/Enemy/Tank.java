package Enemy;

import Constants.Constants;
import Images.ImageFactory;

import Enemy.EnemyType;
import static Images.GameImages.TANK;

public class Tank extends Enemy {
    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(TANK));
        this.setEnemyType(EnemyType.TANK);
        this.setHealth(Constants.TANK_HEALTH);
        this.setSpeed(Constants.TANK_SPEED);
        this.setDamage(Constants.TANK_DAMAGE);
        this.setArmor(Constants.TANK_ARMOR);
        this.setBounty(Constants.TANK_BOUNTY);
    }

}
