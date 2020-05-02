import javax.swing.*;
import java.awt.*;

public class Sudoku extends JPanel {

    //Create new JFrame
    public static void main(String[] args) {

        JFrame sudokuGame = new JFrame();
        sudokuGame.setSize(600, 600);
        sudokuGame.setVisible(true);
        sudokuGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sudokuGame.add(new Sudoku());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Uer defined values for the shades of gray
        Color myGrey = new Color(120, 120, 120);
        Color myLightGrey = new Color(160, 160, 160);

        //Define offset values for the various variables
        int xStartingPoint = 8;
        int yStartingPoint = 8;
        int widthOfBlock = 60;
        int heightOfBlock = 60;

        //One outer rectangle of a deeper shade that will create a shadow effect
        g.setColor(myGrey);
        g.fillRect(6,6, 490, 490);

        g.setColor(myLightGrey);
        //for loop  to create a 8x8 3d risen triangle
        for (int i =0; i<8; i++) {
            for (int j= 0; j<8; j++) {
                g.fill3DRect(xStartingPoint, yStartingPoint, widthOfBlock, heightOfBlock, true);
                xStartingPoint = xStartingPoint + widthOfBlock +1;
            }
            //new starting point
            xStartingPoint = 8;
            yStartingPoint = yStartingPoint + heightOfBlock+1;
        }

    }
}
