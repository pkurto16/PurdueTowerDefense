package src.Graphics;

import src.GameLogic.Runner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class Window {
    public static void main(String[] args) {
        // Create and configure a JFrame
        JFrame frame = new JFrame("Game Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        frame.setSize(400, 300); // Set the size of the window
        frame.setVisible(true); // Make the window visible
        GridLayout map = new GridLayout(Runner.mapGrid.getGridSize(),Runner.mapGrid.getGridSize());
        for(int i = 0; i<Runner.mapGrid.getGridSize(); i++){
            for(int j = 0; j<Runner.mapGrid.getGridSize(); j++){
                String idNum = "id: "+(int)(j+i*Runner.mapGrid.getGridSize());
                map.addLayoutComponent(idNum,new GridPosition(j,i,j+i*Runner.mapGrid.getGridSize()));
            }
        }
        frame.setVisible(true);
    }
}
