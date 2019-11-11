package Tower;

import Models.CanShootObjects;

import java.util.ArrayList;

public abstract class Tower extends CanShootObjects {

    private TowerType towerType;

    private TowerBox towerBox;

    private int cost;
    private int refund;
    private int upgradeCost;

    public Tower(TowerBox towerBox) {
        this.towerBox = towerBox;
        this.bullets = new ArrayList<>();
        lastFireTime = 0;
        this.setX(towerBox.getX());
        this.setY(towerBox.getY());
        initialize();
    }

    protected abstract void initialize();

    public TowerType getTowerType() {
        return this.towerType;
    }

    public void setTowerType(TowerType towerType) {
        this.towerType = towerType;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRefund() {
        return this.refund;
    }

    public void setRefund(int refund) {
        this.refund = refund;
    }

    public int getUpgradeCost() {
        return this.upgradeCost;
    }

    public void setUpgradeCost(int upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

}
