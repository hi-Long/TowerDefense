package Tower;

import Constants.Constants;
import Images.ImageFactory;
import Tower.TowerType;

import static Images.GameImages.SLOW_TOWER_LV2;

public class QuickTowerLevel_2 extends Tower {
    public QuickTowerLevel_2(TowerBox towerBox) {
        super(towerBox);
    }

    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(SLOW_TOWER_LV2));
        this.setTowerType(TowerType.QUICK_TOWER);
        this.setHealth(Constants.QUICK_TOWER_LEVEL2_HEALTH);
        this.setDamage(Constants.QUICK_TOWER_LEVEL2_DAMAGE);
        this.setSpeed(Constants.QUICK_TOWER_LEVEL2_COOL_DOWN);
        this.setRange(Constants.QUICK_TOWER_LEVEL2_RANGE);
    }

}
