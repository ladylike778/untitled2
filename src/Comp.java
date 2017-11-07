import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comp extends JFrame {
    private Container cp;
    String b[] ={"1","2","3","+","4","5","6","-","7","8","9","*","c","0","=","/"};
    JButton o[]=new JButton[16];
    private JTextField t=new JTextField();
    private Dimension dd=Toolkit.getDefaultToolkit().getScreenSize();
    private JPanel p=new JPanel(new GridLayout(4,4));
    private  int FW=200,FH=300;
    public Comp(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        this.setBounds(dd.width/2-FW/2,dd.height/2-FH/2,FW,FH);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        cp.add(t,BorderLayout.NORTH);
        cp.add(p,BorderLayout.CENTER);
        for(int i=0;i<16;i++){
            o[i]=new JButton(b[i]);
            p.add(o[i]);
        }


        o[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[0]);
            }
        });
        o[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[1]);
            }
        });
        o[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[2]);
            }
        });
        o[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t.getText());
                t.setText(t.getText()+"+");

            }
        });
        o[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[4]);
            }
        });
        o[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[5]);
            }
        });
        o[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[6]);
            }
        });
        o[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[7]);

            }
        });
        o[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[8]);
            }
        });
        o[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[9]);
            }
        });
        o[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[10]);
            }
        });
        o[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[11]);
            }
        });
        o[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        o[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[13]);
            }
        });
        o[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ans=t.getText();
                boolean flag=false;
                boolean flag1=false;
                boolean flag2=false;
                boolean flag3=false;

                for(int i=0;i<ans.length();i++){
                    if(ans.charAt(i)== '+'){
                        flag=true;
                    }else if(ans.charAt(i)=='-'){
                        flag1=true;
                    }else if(ans.charAt(i)=='*'){
                        flag2=true;
                    }else if(ans.charAt(i)=='/'){
                        flag3=true;
                    }
                }


                if(flag==true){
                    String data [] = ans.split("\\+");
                    int a =Integer.parseInt(data[0]);
                    int b =Integer.parseInt(data[1]);
                    int c=a+b;
                    t.setText(Integer.toString(c));
                }else if(flag1==true){
                    String data [] = ans.split("-");
                    int a =Integer.parseInt(data[0]);
                    int b =Integer.parseInt(data[1]);
                    int c=a-b;
                    t.setText(Integer.toString(c));
                }else if(flag2==true){
                    String data [] = ans.split("\\*");
                    int a =Integer.parseInt(data[0]);
                    int b =Integer.parseInt(data[1]);
                    int c=a*b;
                    t.setText(Integer.toString(c));
                }else if(flag3==true){
                    String data [] = ans.split("/");
                    float a =Float.parseFloat(data[0]);
                    float b =Float.parseFloat(data[1]);
                    float c=a/b;
                    t.setText(Float.toString(c));
                }
            }
        });
        o[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText()+b[15]);
            }
        });

    }
}
