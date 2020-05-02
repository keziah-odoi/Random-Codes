import javax.swing.*;
import java.awt.*;

public class Pitch  extends JPanel {

    public static void main(String[] args) {

        //Creating a new JFrame
        JFrame footballPitch = new JFrame();
        footballPitch.setSize(800, 950);
        footballPitch.setVisible(true);
        footballPitch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        footballPitch.add(new Pitch());

    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        //Setting rgb values for user defined colors
        Color myDarkGreen = new Color(0, 90, 0);
        Color myLightGreen = new Color(0, 100, 28);
        Color myWhite = new Color(255, 255, 255);
        /*******************************************************************/
        //drawing the various rectangles
        graphics.setColor(myDarkGreen);
        graphics.fillRect(8,0, 750, 50);

        graphics.setColor(myLightGreen);
        graphics.fillRect(8, 50, 750, 80);

        graphics.setColor(myDarkGreen);
        graphics.fillRect(8,130, 750, 80);

        graphics.setColor(myLightGreen);
        graphics.fillRect(8,210, 750, 80);

        graphics.setColor(myDarkGreen);
        graphics.fillRect(8,290, 750, 80);

        graphics.setColor(myLightGreen);
        graphics.fillRect(8,370, 750, 80);

        graphics.setColor(myDarkGreen);
        graphics.fillRect(8,450, 750, 80);

        graphics.setColor(myLightGreen);
        graphics.fillRect(8,530, 750, 80);

        graphics.setColor(myDarkGreen);
        graphics.fillRect(8,610, 750, 80);

        graphics.setColor(myLightGreen);
        graphics.fillRect(8,690, 750, 80);

        graphics.setColor(myDarkGreen);
        graphics.fillRect(8,770, 750, 50);
        /*******************************************************************/
        //set new color
        graphics.setColor(myWhite);
        //Draw the various inner triangles on the top half
        graphics.drawRect(32, 35, 700, 750);
        graphics.drawRect(355, 20, 60, 15);
        graphics.drawRect(310, 35, 150, 30);
        graphics.drawRect(260, 35, 250, 85);
        graphics.drawArc(340, 105, 100, 30, -180, 180);


        //Draw the various inner triangles on the bottom half
        graphics.drawRect(355, 785, 60, 15);
        graphics.drawRect(310, 755, 150, 30);
        graphics.drawRect(260, 700, 250, 85);
        graphics.drawArc(340, 685, 100, 30, 180, -180);

        //draw center line and circle
        graphics.drawLine(32, 405, 731, 405);
        graphics.drawOval(300, 315, 180, 180);
/******************************************************************************/
        //Steps to create players
        graphics.setColor(Color.BLACK);
        //draw outer black circle
        graphics.drawOval(260, 150, 71, 71);

        //draw inner white circle
        graphics.setColor(Color.white);
        graphics.fillOval(260, 150, 70, 70 );
        //draw inner white rectangle

        //draw innermost red circle
        graphics.setColor(Color.red);
        graphics.fillOval(266, 156, 58, 58);

        //draw string 9 on the red circle
        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36));
        graphics.drawString("9", 285, 200);

        //draw rectangles
        graphics.setColor(Color.black);
        graphics.drawRoundRect(245,215,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(246, 216, 100, 30, 40, 10);


        //draw string "Ronaldo" on the white rectangle
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Ronaldo", 257, 238 );


/****************************************************************************/

        graphics.setColor(Color.BLACK);
        graphics.drawOval(460, 150, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(460, 150, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(466, 156, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("10", 474, 200);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(445,215,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(446, 216, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("T. Henry", 457, 238 );


        /***************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(360, 250, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(360, 250, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(366, 256, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("8", 384, 298);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(345,315,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(346, 316, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Essien", 365, 337 );

        /*****************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(100, 325, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(100, 325, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(106, 331, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("11", 115, 373);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(85,390,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(86, 391, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Drogba", 105, 412);

        /********************************************************************/

        graphics.setColor(Color.BLACK);
        graphics.drawOval(600, 325, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(600, 325, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(606, 331, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("7", 625, 373);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(585,390,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(586, 391, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("A. Gyan", 601, 412);

        /*********************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(360, 450, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(360, 450, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(366, 456, 58, 58);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(345,515,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(346, 516, 100, 30, 40, 10);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("6", 385, 500);


        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Appiah", 365, 537);

        /*********************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(100, 530, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(100, 530, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(106, 536, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("3", 125, 580);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(85,595,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(86, 596, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Roooney", 98, 618);

        /******************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(600, 530, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(600, 530, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(606, 536, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("2", 625, 575);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(585,595,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(586, 596, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Hazard", 602, 618);

        /********************************************************************/

        graphics.setColor(Color.BLACK);
        graphics.drawOval(260, 570, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(260, 570, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(266, 576, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36));
        graphics.drawString("4", 285, 618);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(245,635,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(246, 636, 100, 30, 40, 10);


        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Kaka", 270, 660);


        /*********************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(460, 570, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(460, 570, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(466, 576, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36));
        graphics.drawString("5", 485, 618);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(445,635,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(446, 636, 100, 30, 40, 10);


        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Boateng", 458, 660);

        /*********************************************************************/
        graphics.setColor(Color.BLACK);
        graphics.drawOval(360, 690, 71, 71);

        graphics.setColor(Color.white);
        graphics.fillOval(360, 690, 70, 70 );

        graphics.setColor(Color.red);
        graphics.fillOval(366, 696, 58, 58);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 36 ));
        graphics.drawString("1", 384, 735);

        graphics.setColor(Color.black);
        graphics.drawRoundRect(345,753,100,30,40, 10);
        graphics.setColor(Color.white);
        graphics.fillRoundRect(346, 754, 100, 30, 40, 10);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Helvetica", Font.BOLD, 18));
        graphics.drawString("Laryea", 365, 775 );
    }
}
