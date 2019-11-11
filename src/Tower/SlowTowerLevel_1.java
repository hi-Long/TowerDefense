package Tower;

import Constants.Constants;
import Images.ImageFactory;
import Tower.TowerType;

import static Images.GameImages.SLOW_TOWER_LV1;

public class SlowTowerLevel_1 extends Tower {
    public SlowTowerLevel_1(TowerBox towerBox) {
        super(towerBox);
    }

    @Override
    protected void initialize() {
        this.setImage(ImageFactory.createImage(SLOW_TOWER_LV1));
        this.setTowerType(TowerType.SLOW_TOWER);
        this.setHealth(Constants.SLOW_TOWER_LEVEL1_HEALTH);
        this.setDamage(Constants.SLOW_TOWER_LEVEL1_DAMAGE);
        this.setSpeed(Constants.SLOW_TOWER_LEVEL1_COOL_DOWN);
        this.setRange(Constants.SLOW_TOWER_LEVEL1_RANGE);
    }

}
