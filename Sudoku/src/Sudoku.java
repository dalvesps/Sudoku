import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Sudoku {
    class Tile extends JButton{
int r;
int c;
Tile(int r, int c){
    this.r = r;
    this.c = c;
    }
}
int bordWidth = 600;
int bordHeight = 650;

String[] puzzle = {
"--74916-5",
"2---6-3-9",
"-----7-1-",
"-586----4",
"--3----9-",
"--62--187",
"9-4-7---2",
"67-83----",
"81--45---"
};

String[] solution = {
    "387491625",
    "241568379",
    "569327418",
    "758619234",
    "123784596",
    "496253187",
    "934176852",
    "675832941",
    "812945763"
};

JFrame frame = new JFrame("Sudoku");
JLabel textLabel = new JLabel();
JPanel textPanel = new JPanel();
JPanel boardPanel = new JPanel();

Sudoku() {
    
    frame.setSize(bordWidth, bordHeight);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout());

    textLabel.setFont(new Font("Arial", Font.BOLD, 30));
    textLabel.setHorizontalAlignment(JLabel.CENTER);
    textLabel.setText("Sudoku: 0");

    textPanel.add(textLabel);
    frame.add(textPanel, BorderLayout.NORTH);

    boardPanel.setLayout(new GridLayout(9,9));
    setupTiles();
    frame.add(boardPanel, BorderLayout.CENTER);

    frame.setVisible(true);
    }
    void setupTiles(){
        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c++){
                Tile tile = new Tile(r,c);
                char tileChar = puzzle[r].charAt(c);
                if (tileChar !='-'){
                    tile.setFont(new Font("Arial", Font.BOLD, 20));
                    tile.setText(String.valueOf(tileChar));
                    tile.setBackground(Color.lightGray);
                }
                else{
                    tile.setFont(new Font("Arial", Font.PLAIN, 20));
                    tile.setBackground(Color.white);
                }
                tile.setFocusable(false);
                boardPanel.add(tile);
            }
        }
    }
}
