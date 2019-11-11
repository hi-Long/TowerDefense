package Enemy;

import Constants.Constants;
import Images.ImageFactory;

import Enemy.EnemyType;

import static Images.GameImages.PLANE;

public class Plane extends Enemy {
    @Override
    protected void initialize() {

        this.setImage(ImageFactory.createImage(PLANE));
        this.setEnemyType(EnemyType.PLANE);
        this.setHealth(Constants.PLANE_HEALTH);
        this.setSpeed(Constants.PLANE_SPEED);
        this.setDamage(Constants.PLANE_DAMAGE);
        this.setArmor(Constants.PLANE_ARMOR);
        this.setBounty(Constants.PLANE_BOUNTY);
    }

}
