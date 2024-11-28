package org.example;

import org.example.gui.MainWindow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MainWindow mainWindow = new MainWindow();
        mainWindow.initConfiguration("src/main/resources/configuration.properties");
    }
}
