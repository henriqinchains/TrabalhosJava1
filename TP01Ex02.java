/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex02;

/*2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double aresta, area;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do lado do quadrado: ");
        aresta = ler.nextDouble();
        
        
        area = aresta*2;
        System.out.println("A área do quadrado é: " + area);
        
    }
    
}