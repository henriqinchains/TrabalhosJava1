/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex03;

/*3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double diagonal, area;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o comprimento da diagonal do quadrado: ");
        diagonal = ler.nextDouble();
        
        
        area = (Math.pow(diagonal, 2))/2;
        System.out.println("A área do quadrado é: " + area);
        
    }
    
}