package Constants;

import java.awt.*;

public class Constants {
    private Constants(){};

    //Frame properties
    public final static String TITLE = "Tower Defense";
    public final static int FRAME_WIDTH = 1216;
    public final static int FRAME_HEIGHT = 768;
    public final static int GAME_SPEED = 1000 / 60;
    public final static int boxSize = FRAME_WIDTH / 19;

    //------------------------------------------------------------------------------------------------------------------//
    //Important points
    public final static Point start_x = new Point(boxSize * 15 / 2, 0);

    public final static Point[] changeDirection = {  new Point(boxSize * 15 /2 ,boxSize * 9 / 2) ,
                                                    new Point(boxSize * 5 / 2  ,boxSize * 9 / 2) , new Point(boxSize * 5 / 2 ,boxSize * 17 / 2),
                                                    new Point(boxSize * 17 / 2 ,boxSize * 17 / 2), new Point(boxSize * 17 / 2,boxSize * 19 / 2),
                                                    new Point(boxSize * 21 / 2 ,boxSize * 19 / 2), new Point(boxSize * 21 / 2,boxSize * 17 / 2),
                                                    new Point(boxSize * 29 / 2 ,boxSize * 17 / 2), new Point(boxSize * 29 / 2,boxSize * 5 / 2)};

    public final static Point[] towerLocation =  {  new Point(boxSize * 4, boxSize * 3)  , new Point(9 * boxSize , 2 * boxSize),
                                                    new Point(boxSize * 4, boxSize * 6)  , new Point(5 * boxSize , 7 * boxSize),
                                                    new Point(   boxSize    , boxSize * 8)  , new Point(9 * boxSize , 7 * boxSize),
                                                    new Point(boxSize * 7, boxSize * 10) , new Point(13 * boxSize, 2 * boxSize),
                                                    new Point(boxSize * 12, boxSize * 10), new Point(13 * boxSize, 7 * boxSize),
                                                    new Point(boxSize * 16, boxSize * 4) , new Point(16 * boxSize, 8 * boxSize)};
    //------------------------------------------------------------------------------------------------------------------//
    //Important points
    public final static Point TOWER_CHOICE = new Point(0, boxSize * 3);
    //------------------------------------------------------------------------------------------------------------------//
    //Enemy Properties
    public final static String WEEK_ENEMY_URL = "asset_2\\PNG\\Default size\\towerDefense_tile246.png";
    public final static int WEEK_ENEMY_SPAWN_TIME = 2;
    public final static int WEEK_ENEMY_HEALTH = 15;
    public final static int WEEK_ENEMY_SPEED = 3;
    public final static int WEEK_ENEMY_DAMAGE = 200;
    public final static int WEEK_ENEMY_ARMOR = 2;
    public final static int WEEK_ENEMY_BOUNTY = 10;

    public final static String QUICK_ENEMY_URL = "asset_2\\PNG\\Default size\\towerDefense_tile247.png";
    public final static int QUICK_ENEMY_SPAWN_TIME = 7;
    public final static int QUICK_ENEMY_HEALTH = 12;
    public final static int QUICK_ENEMY_SPEED = 4;
    public final static int QUICK_ENEMY_DAMAGE = 200;
    public final static int QUICK_ENEMY_ARMOR = 1;
    public final static int QUICK_ENEMY_BOUNTY = 20;

    public final static String NORMAL_ENEMY_URL = "asset_2\\PNG\\Default size\\towerDefense_tile248.png";
    public final static int NORMAL_ENEMY_SPAWN_TIME = 5;
    public final static int NORMAL_ENEMY_HEALTH = 25;
    public final static int NORMAL_ENEMY_SPEED = 3;
    public final static int NORMAL_ENEMY_DAMAGE = 200;
    public final static int NORMAL_ENEMY_ARMOR = 5;
    public final static int NORMAL_ENEMY_BOUNTY = 25;

    public final static String TANK_URL = "asset_2\\PNG\\Default size\\towerDefense_tile269.png";
    public final static String TANK_GUN_URL = "asset_2\\PNG\\Default size\\towerDefense_tile292.png";
    public final static int TANK_ENEMY_SPAWN_TIME = 25;
    public final static int TANK_HEALTH = 100;
    public final static int TANK_SPEED = 1;
    public final static int TANK_DAMAGE = 200;
    public final static int TANK_ARMOR = 50;
    public final static int TANK_BOUNTY = 100;

    public final static String PLANE_URL = "asset_2\\PNG\\Default size\\towerDefense_tile271.png";
    public final static int PLANE_ENEMY_SPAWN_TIME = 20;
    public final static int PLANE_HEALTH = 25;
    public final static int PLANE_SPEED = 2;
    public final static int PLANE_DAMAGE = 200;
    public final static int PLANE_ARMOR = 20;
    public final static int PLANE_BOUNTY = 40;
    //------------------------------------------------------------------------------------------------------------------//
    // Tower properties
    public final static String QUICK_TOWER_LV1_URL = "asset_2\\PNG\\Default size\\towerDefense_tile249.png";
    public final static int QUICK_TOWER_LEVEL1_RANGE = boxSize * 2;
    public final static int QUICK_TOWER_LEVEL1_COOL_DOWN = 1;
    public final static int QUICK_TOWER_LEVEL1_DAMAGE = 5;
    public final static int QUICK_TOWER_LEVEL1_HEALTH = 10;
    public final static int QUICK_TOWER_LEVEL1_COST = 75;

    public final static String QUICK_TOWER_LV2_URL = "asset_2\\PNG\\Default size\\towerDefense_tile250.png";
    public final static int QUICK_TOWER_LEVEL2_RANGE = boxSize * 5 / 2;
    public final static int QUICK_TOWER_LEVEL2_COOL_DOWN = 3;
    public final static int QUICK_TOWER_LEVEL2_DAMAGE = 7;
    public final static int QUICK_TOWER_LEVEL2_HEALTH = 10;
    public final static int QUICK_TOWER_LEVEL2_COST = 100;

    public final static String NORMAL_TOWER_LV1_URL = "asset_2\\PNG\\Default size\\towerDefense_tile203.png";
    public final static int NORMAL_TOWER_LEVEL1_RANGE = boxSize * 2;
    public final static int NORMAL_TOWER_LEVEL1_COOL_DOWN = 3;
    public final static int NORMAL_TOWER_LEVEL1_DAMAGE = 10;
    public final static int NORMAL_TOWER_LEVEL1_HEALTH = 10;
    public final static int NORMAL_TOWER_LEVEL1_COST = 125;

    public final static String NORMAL_TOWER_LV2_URL = "asset_2\\PNG\\Default size\\towerDefense_tile204.png";
    public final static int NORMAL_TOWER_LEVEL2_RANGE = boxSize * 2;
    public final static int NORMAL_TOWER_LEVEL2_COOL_DOWN = 3;
    public final static int NORMAL_TOWER_LEVEL2_DAMAGE = 15;
    public final static int NORMAL_TOWER_LEVEL2_HEALTH = 10;
    public final static int NORMAL_TOWER_LEVEL2_COST = 120;

    public final static String SLOW_TOWER_LV1_URL = "asset_2\\PNG\\Default size\\towerDefense_tile206.png";
    public final static int SLOW_TOWER_LEVEL1_RANGE = boxSize * 3;
    public final static int SLOW_TOWER_LEVEL1_COOL_DOWN = 5;
    public final static int SLOW_TOWER_LEVEL1_DAMAGE = 30;
    public final static int SLOW_TOWER_LEVEL1_HEALTH = 10;
    public final static int SLOW_TOWER_LEVEL1_COST = 150;

    public final static String SLOW_TOWER_LV2_URL = "asset_2\\PNG\\Default size\\towerDefense_tile205.png";
    public final static int SLOW_TOWER_LEVEL2_RANGE = boxSize * 4;
    public final static int SLOW_TOWER_LEVEL2_COOL_DOWN = 5;
    public final static int SLOW_TOWER_LEVEL2_DAMAGE = 45;
    public final static int SLOW_TOWER_LEVEL2_HEALTH = 10;
    public final static int SLOW_TOWER_LEVEL2_COST = 250;
    //------------------------------------------------------------------------------------------------------------------//
    // Bullet properties
    public final static int BULLET_SPEED = 8;
    public final static String QUICK_TOWER_BULLET_URL = "asset_2\\PNG\\Default size\\towerDefense_tile272.png";
    public final static String NORMAL_TOWER_BULLET_URL = "asset_2\\PNG\\Default size\\towerDefense_tile251.png";
    public final static String SLOW_TOWER_BULLET_URL = "asset_2\\PNG\\Default size\\towerDefense_tile252.png";

    public final static String QUICK_TOWER_BULLET_EXPLOSION_URL = "asset_2\\PNG\\Default size\\towerDefense_tile020.png";
    public final static String NORMAL_TOWER_BULLET_EXPLOSION_URL = "asset_2\\PNG\\Default size\\towerDefense_tile021.png";
    public final static String SLOW_TOWER_BULLET_EXPLOSION_URL = "asset_2\\PNG\\Default size\\towerDefense_tile019.png";
    //------------------------------------------------------------------------------------------------------------------//
    //Images URL:
    public final static String BACKGROUND_URL = "asset_2\\x64_19x12_Map.png";
    public final static String SETTING_URL = "asset_2\\Icons\\Setting.png";
    public final static String SOUND_URL = "asset_2\\Icons\\SoundOn.png";
    public final static String GUIDE_URL = "asset_2\\Icons\\HowToPlay.png";
    public final static String PLAY_URL = "asset_2\\Icons\\Play.png";
    public final static String QUIT_URL = "asset_2\\Icons\\Quit.png";
    public final static String PAUSE_URL = "asset_2\\Pause.png";
    //------------------------------------------------------------------------------------------------------------------//
    // InGame utilities
    public final static String MAP = "asset_2\\x64_19x12_Map.png";
    public final static String GOLD_URL = "asset_2\\Icons\\Gold.png";
    public final static String LIFE_URL = "asset_2\\Icons\\Life.png";
    public final static String WAVE_URL = "asset_2\\Icons\\Wave.png";
    public final static String UPGRADE_URL = "asset_2\\Icons\\Upgrade.png";
    public final static String DESTROY_URL = "asset_2\\Icons\\Destroy.png";
    //------------------------------------------------------------------------------------------------------------------//

}
