package com.se181.gui.listeners;

import com.se181.gui.MainForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("connect")) {
            // Connect to server, then change panel from connect to game
            MainForm.mainForm.displayGamePanel();
        }
    }
}