package Tower;

import Constants.Constants;
import Others.Choices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Tower.WhatToDoWithTheTowerBox;

import javax.swing.*;

import static Tower.WhatToDoWithTheTowerBox.BUILD;
import static Tower.WhatToDoWithTheTowerBox.UPGRADE;

public class TowerBox extends JButton implements ActionListener {

    private Tower tower;

    private WhatToDoWithTheTowerBox toDo;

    private Others.Choices Choices;

    private boolean choicesVisible = false;

    private int GoldAvailable;

    public TowerBox(int x, int y, Choices choices) {
        this.Choices = choices;
        this.setBounds(x, y, Constants.boxSize, Constants.boxSize);
        initialize();
    }

    public void initialize() {

        toDo = BUILD;

        this.setEnabled(true);
        this.setVisible(true);

        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

        this.addActionListener(this);

    }

    public int getGoldAvailable() {
        return GoldAvailable;
    }

    public void setGoldAvailable(int goldAvailable) {
        this.GoldAvailable = goldAvailable;
    }

    public Tower getTower() {
        return this.tower;
    }

    public void buildTower(Tower tower) {
        this.setGoldAvailable(this.getGoldAvailable() - tower.getCost());
        this.tower = tower;
    }

    public WhatToDoWithTheTowerBox getToDo() {
        return toDo;
    }

    public void setToDo(WhatToDoWithTheTowerBox toDo) {
        this.toDo = toDo;
    }

    public void update() {
        if (this.getTower() != null) {
            this.setToDo(UPGRADE);
        }
        else {
            this.setToDo(BUILD);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        choicesVisible = !choicesVisible;
        System.out.println(choicesVisible);

        if (choicesVisible == false) {
            Choices.setTowerBox(null);
        }
        else {
            Choices.setTowerBox(this);
            Choices.update();
        }

        Choices.setEnabled(choicesVisible);
        Choices.setVisible(choicesVisible);
    }
}
