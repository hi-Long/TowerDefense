package Tower;

import Constants.Constants;
import Images.ImageFactory;
import Tower.TowerType;

import static Images.GameImages.SLOW_TOWER_LV2;

public class SlowTowerLevel_2 extends Tower {
    public SlowTowerLevel_2(TowerBox towerBox) {
        super(towerBox);
    }

    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(SLOW_TOWER_LV2));
        this.setTowerType(TowerType.SLOW_TOWER);
        this.setHealth(Constants.SLOW_TOWER_LEVEL2_HEALTH);
        this.setDamage(Constants.SLOW_TOWER_LEVEL2_DAMAGE);
        this.setSpeed(Constants.SLOW_TOWER_LEVEL2_COOL_DOWN);
        this.setRange(Constants.SLOW_TOWER_LEVEL2_RANGE);
    }

}
