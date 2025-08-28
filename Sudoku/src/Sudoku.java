import java.awt.*;
import java.awt.event.*;
import java.swing.*;

import javax.swing.JFrame;

public class Sudoku {
int bordWidth = 600;
int bordHeight = 650;

JFrame frame = new JFrame("Sudoku");
//tempo 5:49
Sudoku(){
    frame.setVisible(true);
    frame.setSize(bordWidth, bordHeight);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout());
}
}
