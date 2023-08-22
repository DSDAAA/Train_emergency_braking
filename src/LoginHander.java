import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginHander implements ActionListener {
    private sys Sys;
    public LoginHander(sys Sys){
        this.Sys=Sys;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JButton jButton=(JButton) e.getSource();
        int n=Integer.parseInt(Sys.getN().getText());
        double h=Double.parseDouble(Sys.getH().getText());
        int i=Integer.parseInt(Sys.getI().getText());
        int Sb=Integer.parseInt(Sys.getSb().getText());
        double V0=((1.6+0.065*n)*(0.028*i-1)/3.6)+Math.sqrt(((Math.pow(1.6+0.065*n,2)*Math.pow(0.028*i-1,2))/12.96)+(16.68*Sb)/(190*h+1.3+i));
        double v1=8.34/(190*h+i+1.3);
        Sys.getV0().setText(String.valueOf(V0/v1));
    }
}
