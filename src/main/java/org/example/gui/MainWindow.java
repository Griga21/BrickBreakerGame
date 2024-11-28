package org.example.gui;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.example.gui.GuiItems.frame;

public class MainWindow {

    public void initConfiguration(String path) {
        File file = new File(path);
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(file));
            frame.setTitle(properties.getProperty("title"));
            frame.setSize(Integer.parseInt(properties.getProperty("width")), Integer.parseInt(properties.getProperty("height")));
            frame.setIconImage(new ImageIcon(properties.getProperty("ico")).getImage());
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            MainPanel mainPanel = new MainPanel();
            frame.add(mainPanel.initMainPanel());
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла конфигураций");
        }

    }


}
