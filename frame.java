import javax.swing.*;
import java.awt.*;

public class RamkaRysunku extends JFrame {
    public static final int Szerokosc=400;
    public static final int Wysokosc=400;
    public RamkaRysunku(){
        setTitle("TestRysunku");
        setSize(Szerokosc,Wysokosc);
        PanelRysunku panel=new PanelRysunku();
        Container powZawartosci=getContentPane();
        powZawartosci.add(panel);
    }
}
