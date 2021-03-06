package com.se181.gui.panels;

import com.se181.clientmodel.Player;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public static final Dimension initialDimensions = new Dimension(850, 520);
    private GridBagConstraints constraints;

    private GameBoardPanel gameBoardPanel;
    private GameInfoPanel gameInfoPanel;

    public GamePanel() {
        super();

        this.setLayout(new BorderLayout());

        gameBoardPanel = new GameBoardPanel();
        this.add(gameBoardPanel, BorderLayout.LINE_START);

        gameInfoPanel = new GameInfoPanel();
        this.add(gameInfoPanel, BorderLayout.LINE_END);

    }

    public void disableAllButtons() {
        gameBoardPanel.disableAllButtons();
        gameInfoPanel.disableAllButtons();
    }

    public void displayMessage(String message) {
        gameInfoPanel.displayMessage("<html>" + message + "</html>");
    }

    public void enableStartButton() {
        this.gameInfoPanel.startGame.setEnabled(true);
    }

    public void enableStartGameButton() {
        gameInfoPanel.enableStartGameButton();
    }

    public void disableStartGameButton() {
        gameInfoPanel.disableStartGameButton();
    }

    public void enableReStartButton() {
        gameInfoPanel.enableRestartButton();
    }

    public void disableRestartGame() {
        gameInfoPanel.disableRestartButton();
    }

    public void enableAllTileButtons() {
        for (int i=0;i<gameBoardPanel.buttons.size();i++) {
            gameBoardPanel.buttons.get(i).setEnabled(true);
        }
    }

    public void disableAllTileButtons() {
        for (int i=0;i<gameBoardPanel.buttons.size();i++) {
            gameBoardPanel.buttons.get(i).setEnabled(false);
        }
    }

    public void enableAllButtons() {
        enableAllTileButtons();
        gameInfoPanel.enableAllButtons();
    }

    public void disableResignButton() {
        gameInfoPanel.disableResignButton();
    }

    public void enableResignButton() {
        gameInfoPanel.enableResignButton();
    }

    public void setPlayersInfo(Player player, Player opponent) {
        gameInfoPanel.setPlayersInfo(player, opponent);
    }
}
