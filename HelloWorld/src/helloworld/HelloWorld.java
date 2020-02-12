/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Aluno
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    static int n = 0;
    public static void main(String[] args) {
       
        while(true)
        {
            System.out.println("Hello world!"+n);
            n++;
            
            if(n == 101)
            {
             n = 0;
            }
        }
        
    }
    
}
