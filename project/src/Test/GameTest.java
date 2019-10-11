package Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;
import game.*;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void gameUITestBattle(){
        Game game = new Game();
        assertTrue(game.uihelper.getBattleInterface() instanceof JPanel);
    }

    @org.junit.jupiter.api.Test
    void gameUITestGame(){
        Game game = new Game();
        assertTrue(game.uihelper.getGameInterface() instanceof JPanel);
    }
    @org.junit.jupiter.api.Test
    void gameUITestInventory(){
        Game game = new Game();
        assertTrue(game.uihelper.getInventoryInterface() instanceof JPanel);
    }
    @org.junit.jupiter.api.Test
    void gameUITestStarting(){
        Game game = new Game();
        assertTrue(game.uihelper.getStartingScene() instanceof JPanel);
    }
    @org.junit.jupiter.api.Test
    void gameUITestending(){
        Game game = new Game();
        assertTrue(game.uihelper.getEndingScene() instanceof JPanel);
    }
    @org.junit.jupiter.api.Test
    void gameUITestVictory(){
        Game game = new Game();
        assertTrue(game.uihelper.getVictoryScene() instanceof JPanel);
    }
    @org.junit.jupiter.api.Test
    void gameUITestText(){
        Game game = new Game();
        assertTrue(game.uihelper.getTextBox() instanceof JPanel);
    }


}