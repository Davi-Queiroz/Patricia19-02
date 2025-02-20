import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] rm = new int[30];
        int[] nota1 = new int[rm.length];
        int[] nota2 = new int[rm.length];
        int[] aprovados = new int[rm.length];
        int[] media = new int[rm.length];
        int n = 0;
        int lerrm;

        System.out.println("Digite um rm, ou negativo para cancelar: ");
        lerrm = in.nextInt();

        while (lerrm > 0 && n <= rm.length) {

            rm[n] = lerrm;
            System.out.println("Digite a nota desse aluno: ");
            nota1[n] = in.nextInt();
            System.out.println("Digite outra nota desse aluno: ");
            nota2[n] = in.nextInt();
            n++;
            System.out.println("Digite um rm, ou negativo para cancelar: ");
            lerrm = in.nextInt();
        }
        if (n >= rm.length) {
            System.out.println("Limite de alunos atingidos");
        }
        for (int i = 0; i < n; i++) {
            //Calcular media
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println("A media do aluno " + rm[i] + " é " + media[i]);
        }
        int nap = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                aprovados[nap] = rm[i];
                nap++;
            }
        }

        for (int i = 0; i < nap; i++) {
            if (aprovados[i] > 6)
                System.out.println("Aprovados: RM" + aprovados[i]);
        }

    }
}