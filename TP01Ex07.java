/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex07;

/*7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex07 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double n1, n2, media;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        n1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = ler.nextDouble();
       
        
        media = Math.sqrt(n1 * n2 );
        
        System.out.println("A média geométrica dos dois números é: " + media);        
    }
    
}