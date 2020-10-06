import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PanelRysunku extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        double lewyX=100;
        double gornyY=100;
        double szerokosc=200;
        double wysokosc=150;
        Rectangle2D pros=new Rectangle2D.Double(lewyX,gornyY,szerokosc,wysokosc);
        g2.draw(pros);
        g2.draw(new Line2D.Double(lewyX,gornyY,lewyX+szerokosc,gornyY+wysokosc));
        g2.draw(new Line2D.Double(lewyX,gornyY+wysokosc,lewyX+szerokosc,gornyY));
    }
}
