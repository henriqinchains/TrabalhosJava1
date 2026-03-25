/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex10;

/*10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex10 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c, f;
        
        System.out.print("Digite a temperatura em celsius: ");
        c = scanner.nextDouble();

        f = (c*1.8)+32;
        
        System.out.print("A temperatura em fahrenheit é: " + f);

    }
    
}