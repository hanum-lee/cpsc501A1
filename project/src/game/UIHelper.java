package game;

import gui.*;

import javax.swing.*;

public class UIHelper {
    private Player player = new Spawner().spawnPlayer();
    private Map game = new Map();
    private GamePanel gamePanel = new GamePanel();
    private JPanel gameInterface = gamePanel.createPanel(game);
    private BattlePanel battlePanel = new BattlePanel();
    private JPanel battleInterface = battlePanel.createPanel(player, game.getEnemy());
    private InventoryPanel inventoryPanel = new InventoryPanel();
    private JPanel inventoryInterface = inventoryPanel.createPanel(player);
    private StartScenePanel startScenePanel = new StartScenePanel();
    private JPanel startingScene = startScenePanel.createPanel();
    private EndScenePanel endScenePanel = new EndScenePanel();
    private JPanel endingScene = endScenePanel.createPanel();
    private VictoryScenePanel victoryScenePanel = new VictoryScenePanel();
    private JPanel victoryScene = victoryScenePanel.createPanel();
    private TextPanel textPanel = new TextPanel();
    private JPanel textBox = textPanel.createPanel();

    public UIHelper(Player player, Map map){
        this.player = player;
        this.game = map;
    }

    public JPanel getStartingScene(){return this.startingScene;}
    public JPanel getGameInterface(){return this.gameInterface;}
    public JPanel getBattleInterface(){return this.battleInterface;}
    public JPanel getInventoryInterface(){return this.inventoryInterface;}
    public JPanel getEndingScene(){return this.endingScene;}
    public JPanel getVictoryScene(){return this.victoryScene;}
    public JPanel getTextBox(){return this.textBox;}
}
