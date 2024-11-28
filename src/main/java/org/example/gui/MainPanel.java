package org.example.gui;

import javax.swing.*;
import java.awt.*;

import static org.example.logic.ActionButton.createGameMap;
import static org.example.logic.ActionButton.showStatistics;

public class MainPanel extends JPanel {
    private JButton startButton = new JButton("Старт");
    private JButton statisticsButton = new JButton("Статистика");

    public JPanel initMainPanel() {
        this.setLayout(null);
        initItemsPanel();
        addButtonAction();
        this.add(startButton);
        this.add(statisticsButton);
        return this;
    }


    private void initItemsPanel() {
        this.setBackground(Color.white);
        startButton.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        startButton.setBackground(Color.white);
        startButton.setBounds(160, 10, 70, 50);

        statisticsButton.setBounds(120, 70, 150, 50);
        statisticsButton.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        statisticsButton.setBackground(Color.white);
    }

    private void addButtonAction() {
        startButton.addActionListener(e -> createGameMap());
        statisticsButton.addActionListener(e -> showStatistics());
    }
}
