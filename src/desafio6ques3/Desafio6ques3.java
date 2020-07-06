/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6ques3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Desafio6ques3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int cont, num, contdentro, contfora;
        contdentro = 0;
        contfora = 0;
        for(cont =1; cont <= 10; cont++){
            num = Integer.parseInt(
                     JOptionPane.showInputDialog("Digite um Numero"));
            if(num>=10 && num<=20){
                 contdentro++;
            } 
        }
     JOptionPane.showMessageDialog(null, "No intervalo de [10,20] "
              + "existem: " +contdentro+" e fora deste intervalo "
              +"existem: "+contfora,"resultado",
             JOptionPane.INFORMATION_MESSAGE);
              }
}