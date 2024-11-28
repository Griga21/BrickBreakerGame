package org.example.logic;

import org.example.gui.GameMap;
import org.example.gui.StatisticsPanel;

import static org.example.gui.GuiItems.frame;

public class ActionButton {

    public static void createGameMap(){
        frame.getContentPane().removeAll();
        frame.repaint();
        frame.add(new GameMap());
    }
    public static void showStatistics(){
        frame.getContentPane().removeAll();
        frame.repaint();
        frame.add(new StatisticsPanel());
    }
}
