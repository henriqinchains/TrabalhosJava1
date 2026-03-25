/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex01;

/*1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double base, altura;
        double area;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a altura do retângulo: ");
        altura = ler.nextDouble();
        System.out.println("Digite a base do retângulo: ");
        base = ler.nextDouble();
        
        area = base*altura;
        System.out.println("A área do retângulo é: " + area);
        
    }
    
}