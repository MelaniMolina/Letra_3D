import javax.swing.*;
import java.awt.*;
public class PanelDibujo extends JPanel {
    //dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int anchura = getWidth();//Anchura total
        int altura = getHeight();//altura total

        //dinuja una linea de la esquina superior izquierda a la esquina superior derecha
        //g.draw3DRect(15,150,50,60,true);
        g.setColor(Color.pink);
        g.fill3DRect(100,100,300,40,false);
        g.setColor(Color.gray);
        g.fill3DRect(100,130,300,20,false);

        g.setColor(Color.cyan);
        g.fill3DRect(100,100,40,200,false);
        g.setColor(Color.gray);
        g.fill3DRect(139,130,20,130,false);


        g.setColor(Color.pink);
        g.fill3DRect(140,260,260,40,false);
        g.setColor(Color.gray);
        g.fill3DRect(100,290,300,20,false);

        g.setColor(Color.cyan);
        g.fill3DRect(370,260,40,200,false);
        g.setColor(Color.gray);
        g.fill3DRect(360,300,20,150,false);

        g.setColor(Color.pink);
        g.fill3DRect(99,450,310,40,false);
        g.setColor(Color.gray);
        g.fill3DRect(99,480,310,20,false);






        //g.fill3DRect(100,100,40,300,false);
        //g.draw3DRect(50,60,85,90,true);
        //g.fill3DRect(350,100,40,300,false);
        //g.draw3DRect(85,90,120,60,true);
        //g.setColor(Color.red);
        //g.fill3DRect(150,100,90,90,false);
        //g.fillArc(350,100,40,300,-270,-360);
        //g2d.rotate(Math.toRadians(45), 150, 200);
        /*g.drawLine(20,20,20,100);
        g.drawLine(20,20,50,75);
        g.drawLine(50,75,80,20);
        g.drawLine(80,20,80,100);*/

    }
}