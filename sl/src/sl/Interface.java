
package sl;

import javax.swing.JOptionPane;


public class Interface 
{
    public void executar()
    {
         Conversor cv = new Conversor();
         
         String op = JOptionPane.showInputDialog(null, "Qual opção?(+ - / ou *)");
         String s_n1 = JOptionPane.showInputDialog(null, "numero 1:");
         String s_n2 = JOptionPane.showInputDialog(null, "numero 2:");
         
         float n1 = cv.string_float(s_n1);
         float n2 = cv.string_float(s_n2);
         
         if(op.equals("+"))
         {
             float resu = new Soma().calcular(n1,n2);
             JOptionPane.showMessageDialog(null,"soma é "+resu);
         }else if(op.equals("-"))
         {
             float resu = new Subtracao().calcular(n1,n2);
             JOptionPane.showMessageDialog(null,"A subtracao é "+resu);
         }else if(op.equals("/"))
         {
             if(n2 == 0)
             {
                 s_n2 = JOptionPane.showInputDialog(null,"Divisao por zero dá nao, broll. Digite outro denominador:");
                 n2 = Integer.parseInt(s_n2);
                 
                  float resu = new Divisao().calcular(n1,n2);
                  JOptionPane.showMessageDialog(null,"A divisão é "+resu);
                 
             }else
             {
                float resu = new Divisao().calcular(n1,n2);
                JOptionPane.showMessageDialog(null,"A divisão é "+resu);
             } 
         }else if(op.equals("*"))
         {
             float resu = new Multiplicacao().calcular(n1,n2);
             JOptionPane.showMessageDialog(null,"A multiplicacao é "+resu);
         }
    }
}
