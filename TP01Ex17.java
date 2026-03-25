package tp01ex17;

/*17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) 
    {
        double x, y, elevado;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de X: ");
        x = scanner.nextDouble();
        
        System.out.println("Digite o valor de Y: ");
        y = scanner.nextDouble();
        
        elevado = Math.pow(x, y);
        
        System.out.println("O valor de X elevado a Y é: " + elevado);
        
        System.out.println("O número de Euler elevado a X é: " + (Math.exp(x)));
        System.out.println("O número de Euler elevado a Y é: " + (Math.exp(y)));
        
        System.out.println("O logarítmo natural de X é: " + (Math.log(x)));
        System.out.println("O logarítmo natural de Y é: " + (Math.log(y)));
        
    }
}