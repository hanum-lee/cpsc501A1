package Test;

import game.Enemy;
import game.Experience;
import game.Player;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void setLevelTest_PositiveLevel() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setLevel(2);
        assertEquals("Player level should be 2",2,p1.exp.getCurrentLevel());
    }

    @org.junit.jupiter.api.Test
    public void setLevelTest_NegativeLevel() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setLevel(-1);
        assertEquals("Player level should be 1",1,p1.getCurrentLevel());
    }

    @org.junit.jupiter.api.Test
    public void setExpToLvlTest_Positive() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setExpToLvl(2);
        assertEquals("Player exp to lvl should be 2",2,p1.getExpToLvl());
    }

    @org.junit.jupiter.api.Test
    public void setExpToLvlTest_Negative() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setExpToLvl(-1);
        assertEquals("Player exp to lvl should be 1",1,p1.getExpToLvl());
    }

    @org.junit.jupiter.api.Test
    public void setCurrentExpTest_Positive() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setCurrentExp(2);
        assertEquals("Player current exp should be 2",2,p1.getCurrentExp());
    }

    @org.junit.jupiter.api.Test
    public void setCurrentExpTest_Negative() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setCurrentExp(-1);
        assertEquals("Player current exp should be 0",0,p1.getCurrentExp());
    }

    @org.junit.jupiter.api.Test
    public void levelUpTest() {
        Player p1 = new Player("Default", 10, 1);
        p1.exp.setCurrentExp(1);
        p1.checkExp();
        assertEquals("Player current exp should be 1",1,p1.exp.getCurrentExp());
        assertEquals("Player level should be 2",2,p1.exp.getCurrentLevel());
        assertEquals("Player attack should be 2",2,p1.getAttack());
        assertEquals("Player expToLvl should be 2",2,p1.exp.getExpToLvl());
    }

    @org.junit.jupiter.api.Test
    public void obtainExpTest_1Exp() {
        Player p1 = new Player("Default", 10, 1);
        Enemy e1 = new Enemy("E1",1,1,1);
        p1.obtainExp(e1);
        assertEquals("Player current exp should be 1",1,p1.exp.getCurrentExp());
    }

    @org.junit.jupiter.api.Test
    public void obtainExpTest_10Exp() {
        Player p1 = new Player("Default", 10, 1);
        Enemy e1 = new Enemy("E1",1,1,10);
        p1.obtainExp(e1);
        assertEquals("Player current exp should be 10",10,p1.exp.getCurrentExp());
    }

}