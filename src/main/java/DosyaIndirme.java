import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DosyaIndirme extends JFrame {
    private JProgressBar check_progress;
    private JPanel AnaPanel;
    private JButton dosya_indir;

    private int count=0;

    public DosyaIndirme() {
        add(AnaPanel);
        setTitle("Dosya İndirme");
        setBounds(new java.awt.Rectangle(500, 150, 400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        dosya_indir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                final Timer timer=new Timer(50,null);

                timer.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        count++;

                        check_progress.setValue(count);

                        if(check_progress.getValue()==100){
                            timer.stop();

                            SonucSayfasi sonucSayfasi=new SonucSayfasi();
                            setVisible(false);
                            sonucSayfasi.setVisible(true);

                        }
                    }
                });

                timer.start();
            }
        });

    }



    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DosyaIndirme d=new DosyaIndirme();
                d.setVisible(true);
            }
        });



    }
}
