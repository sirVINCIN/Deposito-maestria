
package sl;

import javax.swing.JOptionPane;

public class Executor 
{
    public static void main(String[] args) 
    {
        
        while(true)
        {
            new Interface().executar();
            int resp = JOptionPane.showConfirmDialog(null, "continuar?");
            
            if(resp == 1){break;}
            //System.out.println(resp);
        }
            
    }
}
