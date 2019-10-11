package Test;

import game.Map;
import org.junit.Test;
import game.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testtextMaze(){
        Map map = new Map();
        String[][] maze = map.textMaze();
        assertEquals("test", maze);
    }
}