import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException p) {
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            System.out.println();
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
    }
}
