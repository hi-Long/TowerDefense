package Enemy;

import Constants.Constants;
import Models.CanShootObjects;
import Models.ObjectsModel;

import java.awt.*;

import static Enemy.Direction.*;

public abstract class Enemy extends CanShootObjects {

    private int armor;
    private int bounty;
    private long spawnTime;

    private EnemyType enemyType;
    private Direction direction;

    public Enemy() {
        this.setX((int) Constants.start_x.getX());
        this.setY((int) Constants.start_x.getY());
        this.setDirection(DOWN);
        this.setIsDead(false);
        initialize();
    }

    protected abstract void initialize();

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    public EnemyType getEnemyType() {
        return this.enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean escape() {
        if (this.getX() > Constants.FRAME_WIDTH) {
            this.setIsDead(true);
            return true;
        }
        return false;
    }

    public boolean isInShiftPoint(Point shiftPoint) {
        int shiftCenterX = (int) shiftPoint.getX();
        int shiftCenterY = (int) shiftPoint.getY();
        return (Math.abs(this.getX() - shiftCenterX) <= this.getSpeed() && Math.abs(this.getY() - shiftCenterY) <= this.getSpeed());
    }

    public void shiftDirection() {
        if (isInShiftPoint(Constants.changeDirection[1]) || isInShiftPoint(Constants.changeDirection[3])){
            this.setDirection(DOWN);
        }

        else if(isInShiftPoint(Constants.changeDirection[5]) || isInShiftPoint(Constants.changeDirection[7])) {
            this.setDirection(UP);
        }

        else if(isInShiftPoint(Constants.changeDirection[0])){
            this.setDirection(LEFT);
        }

        else if (isInShiftPoint(Constants.changeDirection[2]) || isInShiftPoint(Constants.changeDirection[4])
                    || isInShiftPoint(Constants.changeDirection[6]) || isInShiftPoint(Constants.changeDirection[8])){
            this.setDirection(RIGHT);
        }
    }

    public void move() {
        shiftDirection();
        switch (this.getDirection()) {
            case UP:
                this.moveUp();
                break;
            case DOWN:
                this.moveDown();
                break;
            case LEFT:
                this.moveLeft();
                break;
            case RIGHT:
                this.moveRight();
                break;
        }
    }

    private void moveUp() {
        this.setY(this.getY() - this.getSpeed());
    }

    private void moveDown() {
        this.setY(this.getY() + this.getSpeed());
    }

    private void moveLeft() {
        this.setX(this.getX() - this.getSpeed());
    }

    private void moveRight() {
        this.setX(this.getX() + this.getSpeed());
    }

}
