/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex06;

/*6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double n1, n2, n3, n4, media;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        n1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = ler.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        n3 = ler.nextDouble();
        System.out.println("Digite o quarto valor: ");
        n4 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("A média aritmética é: " + media);        
    }
    
}