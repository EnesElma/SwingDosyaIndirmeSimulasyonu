import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SonucSayfasi extends JFrame {
    private JPanel sonucPanel;
    private JButton cikis;

    public SonucSayfasi(){
        add(sonucPanel);
        setTitle("Sonuc sayfasi");
        setBounds(new java.awt.Rectangle(500, 150, 300, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        cikis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
