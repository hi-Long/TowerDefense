package Others;

import Tower.WhatToDoWithTheTowerBox;
import Images.ImageFactory;
import Tower.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

import static Constants.Constants.*;
import static Images.GameImages.*;
import static Tower.TowerType.*;
import static Tower.WhatToDoWithTheTowerBox.BUILD;

public class Choices extends JPanel implements ActionListener {

    private JButton QuickTower_Upgrade;
    private JButton NormalTower_Destroy;
    private JButton SlowTower;

    private TowerBox towerBox;

    private WhatToDoWithTheTowerBox whatToDoWithTheTowerBox;

    private int GoldAvailable;
    private int GoldUsed;

    public Choices(int GoldAvailable) {
        this.GoldAvailable = GoldAvailable;
        initialize();
    }

    public void initialize() {

        this.setLayout(new GridLayout(3, 1));
        this.setBounds(0, boxSize * 3, boxSize, boxSize * 3);

        this.whatToDoWithTheTowerBox = BUILD;

        buttonsInitialize();

        this.add(QuickTower_Upgrade);
        this.add(NormalTower_Destroy);
        this.add(SlowTower);

        this.validate();
        this.setOpaque(false);
        this.setEnabled(true);
        this.setVisible(true);

    }

    private void buttonsInitialize() {
        QuickTower_Upgrade = new JButton();
        NormalTower_Destroy = new JButton();
        SlowTower = new JButton();

        QuickTower_Upgrade.setActionCommand("1");
        NormalTower_Destroy.setActionCommand("2");
        SlowTower.setActionCommand("3");

        QuickTower_Upgrade.addActionListener(this);
        NormalTower_Destroy.addActionListener(this);
        SlowTower.addActionListener(this);

        QuickTower_Upgrade.setContentAreaFilled(false);
        NormalTower_Destroy.setContentAreaFilled(false);
        SlowTower.setContentAreaFilled(false);

        QuickTower_Upgrade.setBorderPainted(false);
        NormalTower_Destroy.setBorderPainted(false);
        SlowTower.setBorderPainted(false);

        QuickTower_Upgrade.setEnabled(true);
        NormalTower_Destroy.setEnabled(true);
        SlowTower.setEnabled(true);

        QuickTower_Upgrade.setVisible(true);
        NormalTower_Destroy.setVisible(true);
        SlowTower.setVisible(true);
    }

    public void update () {
        if (this.getTowerBox() != null) {
            this.setWhatToDoWithTheTowerBox(this.towerBox.getToDo());
            this.setButtonIcon();
            this.setGoldAvailable(getGoldAvailable());
        }
    }

    public void setButtonIcon() {
        switch (whatToDoWithTheTowerBox) {
            case BUILD:
                QuickTower_Upgrade.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(QUICK_TOWER_LV1))));
                NormalTower_Destroy.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(NORMAL_TOWER_LV1))));
                SlowTower.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(SLOW_TOWER_LV1))));
                break;
            case UPGRADE:
                QuickTower_Upgrade.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(UPGRADE))));
                NormalTower_Destroy.setIcon(new ImageIcon(Objects.requireNonNull(ImageFactory.createImage(DESTROY))));
                SlowTower.setIcon(null);
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand() + this.getWhatToDoWithTheTowerBox());
        if (this.getWhatToDoWithTheTowerBox() == BUILD) {
            if ("1".equals(e.getActionCommand()) && (this.getGoldAvailable() >= QUICK_TOWER_LEVEL1_COST)) {
                this.getTowerBox().buildTower(new QuickTowerLevel_1(this.getTowerBox()));
                this.setGoldUsed(QUICK_TOWER_LEVEL1_COST);
            }
            if ("2".equals(e.getActionCommand()) && (this.getGoldAvailable() >= NORMAL_TOWER_LEVEL1_COST)) {
                this.getTowerBox().buildTower(new NormalTowerLevel_1(this.getTowerBox()));
                this.setGoldUsed(NORMAL_TOWER_LEVEL1_COST);
            }
            if ("3".equals(e.getActionCommand()) && (this.getGoldAvailable() >= SLOW_TOWER_LEVEL1_COST)) {
                this.getTowerBox().buildTower(new SlowTowerLevel_1(this.getTowerBox()));
                this.setGoldUsed(SLOW_TOWER_LEVEL1_COST);
            }
            this.setEnabled(false);
            this.setVisible(false);
        }
        else {
            if ("1".equals(e.getActionCommand())) {
                if (this.getTowerBox().getTower().getTowerType() == QUICK_TOWER && (this.getGoldAvailable() >= QUICK_TOWER_LEVEL2_COST)) {
                    this.getTowerBox().buildTower(new QuickTowerLevel_2(this.getTowerBox()));
                    this.setGoldUsed(QUICK_TOWER_LEVEL2_COST);
                }
                if (this.getTowerBox().getTower().getTowerType() == NORMAL_TOWER && (this.getGoldAvailable() >= NORMAL_TOWER_LEVEL2_COST)) {
                    this.getTowerBox().buildTower(new NormalTowerLevel_2(this.getTowerBox()));
                    this.setGoldUsed(NORMAL_TOWER_LEVEL2_COST);
                }
                if (this.getTowerBox().getTower().getTowerType() == SLOW_TOWER && (this.getGoldAvailable() >= SLOW_TOWER_LEVEL2_COST)) {
                    this.getTowerBox().buildTower(new SlowTowerLevel_2(this.getTowerBox()));
                    this.setGoldUsed(SLOW_TOWER_LEVEL2_COST);
                }
            }
            if ("2".equals(e.getActionCommand())) {
                this.getTowerBox().buildTower(null);
            }
        }
    }

    //Getter, setter ---------------------------------------------------------------------------------------------------//
    public TowerBox getTowerBox() {
        return towerBox;
    }

    public void setTowerBox(TowerBox towerBox) {
        this.towerBox = towerBox;
    }

    public WhatToDoWithTheTowerBox getWhatToDoWithTheTowerBox() {
        return whatToDoWithTheTowerBox;
    }

    public void setWhatToDoWithTheTowerBox(WhatToDoWithTheTowerBox whatToDoWithTheTowerBox) {
        this.whatToDoWithTheTowerBox = whatToDoWithTheTowerBox;
    }

    public int getGoldAvailable() {
        return this.GoldAvailable;
    }

    public void setGoldAvailable(int goldAvailable) {
        this.GoldAvailable = goldAvailable;
    }

    public void setGoldUsed(int goldUsed) {
        this.GoldUsed = goldUsed;
    }

    public int getGoldUsed() {
        return this.GoldUsed;
    }
}


