package gui;

import javax.swing.JOptionPane;

public class Gui 
{
    public static void main(String[] args) 
    {
        while(true)
        {
            String niver = JOptionPane.showInputDialog("Digite sua data de nascimento:");
            String atual = JOptionPane.showInputDialog("Qual o ano atual?");
               
            int niver_int = Integer.parseInt(niver);
            int atual_int = Integer.parseInt(atual);
            int idade = atual_int - niver_int;
            JOptionPane.showMessageDialog(null,"sua idade é/ou quase: "+idade);
            
            int op = JOptionPane.showConfirmDialog(null, "Mais uma rodada?");
            if(op == 1){break;}
        }
        
     
    }
}
