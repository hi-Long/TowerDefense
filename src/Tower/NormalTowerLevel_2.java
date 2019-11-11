package Tower;

import Constants.Constants;
import Images.ImageFactory;

import static Images.GameImages.NORMAL_TOWER_LV2;
import Tower.TowerType;

public class NormalTowerLevel_2 extends Tower {
    public NormalTowerLevel_2(TowerBox towerBox) {
        super(towerBox);
    }

    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(NORMAL_TOWER_LV2));
        this.setTowerType(TowerType.NORMAL_TOWER);
        this.setHealth(Constants.NORMAL_TOWER_LEVEL2_HEALTH);
        this.setDamage(Constants.NORMAL_TOWER_LEVEL2_DAMAGE);
        this.setSpeed(Constants.NORMAL_TOWER_LEVEL2_COOL_DOWN);
        this.setRange(Constants.NORMAL_TOWER_LEVEL2_RANGE);
    }

}
