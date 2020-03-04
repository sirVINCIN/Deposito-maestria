
package janela;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Janela extends JFrame
{
    private JLabel lb_1;
    private JLabel lb_2;
    private JLabel lb_3;
    
    public Janela()
    {
        super("Janela 01");
        setLayout(new FlowLayout());
       
        lb_1 = new JLabel("Hello world!");
        lb_1.setToolTipText("Label com texto");
        add(lb_1);
   
        Icon bug = new ImageIcon(getClass().getResource("bug.png"));
        lb_2 = new JLabel("Buldogue",bug, SwingConstants.CENTER);
        lb_2.setToolTipText("Lable com Icon e Imagem");
        add(lb_2);
      
        lb_3 = new JLabel("Lable 3");
        lb_3.setToolTipText("label 3");
        lb_3.setIcon(bug);
        lb_3.setHorizontalTextPosition(SwingConstants.LEFT);
        lb_3.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(lb_3);
    }
    
    public static void main(String[] args) {
        Janela j = new Janela();
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
        j.setSize(500, 500);
    }
}
