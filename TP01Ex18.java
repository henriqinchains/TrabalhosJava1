package tp01ex18;

/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) 
    {
        double item1, item2, item3, item4, item5, pagamento;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro produto: ");
        item1 = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo produto: ");
        item2 = scanner.nextDouble();
        
        System.out.println("Digite o valor do terceiro produto: ");
        item3 = scanner.nextDouble();
        
        System.out.println("Digite o valor do quarto produto: ");
        item4 = scanner.nextDouble();
        
        System.out.println("Digite o valor do quinto produto: ");
        item5 = scanner.nextDouble();
        
        System.out.println("Digite o valor pago: ");
        pagamento = scanner.nextDouble();
        
        System.out.println("O seu troco é: " + ((pagamento)-(item1+item2+item3+item4+item5)));
        
    }
}