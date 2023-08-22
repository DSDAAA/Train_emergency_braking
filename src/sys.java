import javax.swing.*;
import java.awt.*;

public class sys extends JFrame{
    JLabel label=new JLabel("计算列车紧急制动限速",JLabel.CENTER);
    JPanel centerPanel=new JPanel();
    JLabel test1=new JLabel("计算列车紧急制动限速");
    JLabel test2=new JLabel("机车种类：货物列车               轴承：滚动轴承");
    JLabel test3=new JLabel("闸瓦种类：高磷闸瓦    管定压：500kpa");

    JLabel test4=new JLabel("牵引辆数（n）=");
    JTextField n=new JTextField();

    JLabel test5=new JLabel("     换算制动率（h）=");
    JTextField h=new JTextField();

    JLabel test6=new JLabel("        坡度（i）=");
    JTextField i=new JTextField();

    JLabel test7=new JLabel("                             Sb=");
    JTextField Sb=new JTextField();
    JLabel test8=new JLabel("结果（V0）=");
    JTextField V0=new JTextField();
    JButton jButton=new JButton("计算");
    JLabel test9=new JLabel("(结果误差在4千米每小时之内)");
    LoginHander loginHander;
    public sys(){
        super("计算列车紧急制动限速");
        loginHander=new LoginHander(this);
        Container container=getContentPane();
        n.setPreferredSize(new Dimension(100,20));
        h.setPreferredSize(new Dimension(100,20));
        i.setPreferredSize(new Dimension(100,20));
        Sb.setPreferredSize(new Dimension(100,20));
        V0.setPreferredSize(new Dimension(200,20));
        centerPanel.add(label);
        centerPanel.add(test2);
        centerPanel.add(test3);
        centerPanel.add(test4);
        centerPanel.add(n);
        centerPanel.add(test5);
        centerPanel.add(h);
        centerPanel.add(test6);
        centerPanel.add(i);
        centerPanel.add(test7);
        centerPanel.add(Sb);
        jButton.addActionListener(loginHander);
        centerPanel.add(jButton);
        centerPanel.add(test8);
        centerPanel.add(V0);
        centerPanel.add(test9);
        container.add(label,BorderLayout.NORTH);
        container.add(centerPanel,BorderLayout.CENTER);

        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public JTextField getN() {
        return n;
    }

    public void setN(JTextField n) {
        this.n = n;
    }

    public JTextField getH() {
        return h;
    }

    public void setH(JTextField h) {
        this.h = h;
    }

    public JTextField getI() {
        return i;
    }

    public void setI(JTextField i) {
        this.i = i;
    }

    public JTextField getSb() {
        return Sb;
    }

    public void setSb(JTextField sb) {
        Sb = sb;
    }

    public JTextField getV0() {
        return V0;
    }

    public void setV0(JTextField v0) {
        V0 = v0;
    }

    public static void main(String[] args) {
        new sys();
    }

}