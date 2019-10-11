package Test;

import game.Map;
//import org.junit.Test;
import game.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    FileReader fileReader;
    final int ROWS = 1;
    final int COLS = 17;



    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        FileReader fileReader = new FileReader();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testtextMaze(){
        String[][] testString = {{"w","v","r","x","1","2","3","4","5","6","a","b","c","d","e","n","m"}};
        String[][] maze = textMaze(testString);
        System.out.println(Arrays.toString(maze[0]));
        String[][] testMaze = newtextMaze(testString);
        System.out.println(Arrays.toString(testMaze[0]));
        for (int i = 0; i < 1; i++){
            assertArrayEquals(testMaze[i],maze[i]);
        }
        
    }
    @org.junit.jupiter.api.Test
    void testtextMazeNull(){
        String[][] testString = {{" "," ","r","x","1","2","3","4","5","6","a","b","c","d","e","n","m"}};
        String[][] maze = textMaze(testString);
        System.out.println(Arrays.toString(maze[0]));
        String[][] testMaze = newtextMaze(testString);
        System.out.println(Arrays.toString(testMaze[0]));
        for (int i = 0; i < 1; i++){
            assertArrayEquals(testMaze[i],maze[i]);
        }
    }

    private String[][] newtextMaze(String[][] testString){

        String[][] maze = testString;
        String[][] textMaze = new String[ROWS][COLS];
        String[] letterArray = {"w","v","r","x","1","2","3","4","5","6","a","b","c","d","e","n","m"};
        String[] corresArray = {"#","#"," ","X","?","?","?","?","?","?","E","E","E","E","E"," "," "};
        String letters = "wvrx123456abcdenm";
        String corres =  "## X??????EEEEE  ";

        for(int r = 0; r < ROWS; r++)
        {
            for(int c = 0; c < COLS; c++)
            {
                String letter = maze[r][c];
                int indexofLetter = letters.indexOf(letter);
                if(indexofLetter >= 0){
                    textMaze[r][c] = "" + corres.charAt(indexofLetter);
                }

            }
        }
        return textMaze;
    }

    public String[][] textMaze(String[][] testString)
    {
        String[][] textMaze = new String[ROWS][COLS];
        String[][] maze = testString;
        String[] letterArray = {"w","v","r","x","1","2","3","4","5","6","a","b","c","d","e","n","m"};
        String[] corresArray = {"#","#"," ","X","?","?","?","?","?","?","E","E","E","E","E"," "," "};

        for(int r = 0; r < ROWS; r++)
        {
            for(int c = 0; c < COLS; c++)
            {
                String letter = maze[r][c];

                switch(letter)
                {
                    case "w":
                        textMaze[r][c] = "#";
                        break;
                    case "v":
                        textMaze[r][c] = "#";
                        break;
                    case "r":
                        textMaze[r][c] = " ";
                        break;
                    case "x":
                        textMaze[r][c] = "X";
                        break;
                    case "1":
                        textMaze[r][c] = "?";
                        break;
                    case "2":
                        textMaze[r][c] = "?";
                        break;
                    case "3":
                        textMaze[r][c] = "?";
                        break;
                    case "4":
                        textMaze[r][c] = "?";
                        break;
                    case "5":
                        textMaze[r][c] = "?";
                        break;
                    case "6":
                        textMaze[r][c] = "?";
                        break;
                    case "a":
                        textMaze[r][c] = "E";
                        break;
                    case "b":
                        textMaze[r][c] = "E";
                        break;
                    case "c":
                        textMaze[r][c] = "E";
                        break;
                    case "d":
                        textMaze[r][c] = "E";
                        break;
                    case "e":
                        textMaze[r][c] = "E";
                        break;
                    case "n":
                        textMaze[r][c] = " ";
                        break;
                    case "m":
                        textMaze[r][c] = " ";
                        break;
                }
            }
        }
        return textMaze;
    }
}