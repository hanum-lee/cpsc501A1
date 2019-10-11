package Test;

import game.Map;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testtextMaze(){
        Map map = new Map();
        map.displayMaze();
    }
}