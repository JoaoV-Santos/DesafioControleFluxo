import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro parâmtro");
        int parametroUm = in.nextInt();
        System.out.println("Informe o segundo parâmtro");
        int parametroDois = in.nextInt();

        try {
            if (parametroUm > parametroDois)
                throw new ParametrosInvalidosException(parametroUm, parametroDois);
            else
                contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        in.close();
    }

    static void contar(int parametroUm, int parametroDois) {

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}