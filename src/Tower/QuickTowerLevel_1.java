package Tower;

import Constants.Constants;
import Images.ImageFactory;
import Tower.TowerType;

import java.util.LinkedList;

import static Images.GameImages.QUICK_TOWER_LV1;

public class QuickTowerLevel_1 extends Tower {
    public QuickTowerLevel_1(TowerBox towerBox) {
        super(towerBox);
    }

    @Override
    protected void initialize() {
        this.bullets = new LinkedList<>();
        this.setImage(ImageFactory.createImage(QUICK_TOWER_LV1));
        this.setTowerType(TowerType.QUICK_TOWER);
        this.setHealth(Constants.QUICK_TOWER_LEVEL1_HEALTH);
        this.setDamage(Constants.QUICK_TOWER_LEVEL1_DAMAGE);
        this.setSpeed(Constants.QUICK_TOWER_LEVEL1_COOL_DOWN);
        this.setRange(Constants.QUICK_TOWER_LEVEL1_RANGE);
    }

}
