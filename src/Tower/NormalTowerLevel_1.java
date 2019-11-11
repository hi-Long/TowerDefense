package Tower;

import Constants.Constants;
import Images.ImageFactory;
import Tower.TowerType;

import static Images.GameImages.NORMAL_TOWER_LV1;

public class NormalTowerLevel_1 extends Tower {

    public NormalTowerLevel_1(TowerBox towerBox) {
        super(towerBox);
    }

    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(NORMAL_TOWER_LV1));
        this.setTowerType(TowerType.NORMAL_TOWER);
        this.setHealth(Constants.NORMAL_TOWER_LEVEL1_HEALTH);
        this.setDamage(Constants.NORMAL_TOWER_LEVEL1_DAMAGE);
        this.setSpeed(Constants.NORMAL_TOWER_LEVEL1_COOL_DOWN);
        this.setRange(Constants.NORMAL_TOWER_LEVEL1_RANGE);
    }

}
