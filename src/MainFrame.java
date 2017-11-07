import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private Container cp;
    private Dimension dd=Toolkit.getDefaultToolkit().getScreenSize();
    private  int FW=600,FH=400;
    private JPanel p1=new JPanel(new GridLayout(1,6));
    private JButton b1=new JButton("樂透");
    private JButton b2=new JButton("計算機");
    private JButton b3=new JButton("讀取檔案");
    private JButton b4=new JButton("移動圖片");
    private JButton b5=new JButton("縮放圖片");
    private JButton b6=new JButton("井字遊戲");
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(dd.width/2-FW/2,dd.height/2-FH/2,FW,FH);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp.add(p1, BorderLayout.NORTH);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Comp nnn=new Comp();
                nnn.setVisible(true);

            }
        });
    }
}
