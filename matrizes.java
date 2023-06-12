import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*// Qeustão 1
        int m[][] = new int[3][3];
        int soma1 = 0;
        int soma2 = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    soma1 = m[i][j];
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 1; j < m[i].length; j++) {
                if (i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0) {
                    soma2 = m[i][j];
                }
            }
        }
        if (soma1 == soma2) {
            System.out.println("As diagonais tem somas iguais.");
        } else {
            System.out.println("As diagonais não tem somas iguais.");
        }
        // Questão 2
        int m[][] = new int[3][2];
        int mT[][] = new int[2][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < mT.length; i++) {
            for (int j = 0; j < mT[i].length; j++) {
                mT[i][j] = m[j][i];
                System.out.printf("%2d\t", mT[i][j]);
            }
            System.out.println("");
        }
        // Questão 3
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("Digite um valor: ");
                m1[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("Digite um valor: ");
                m2[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = m2[i][j] + m1[i][j];
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.printf("%2d\t", m2[i][j]);
            }
            System.out.println("");
        }
        // Questão 4
        int m[][] = new int[3][3];
        int s = 0;
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
                s += m[i][j];
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (i == j && m[i][j] == 1) {
                    c++;
                }
            }
        }
        if (c == 3) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz não é identidade.");
        }
        // Questão 5
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("Digite um valor: ");
                m1[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("Digite um valor: ");
                m2[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = m2[i][j] - m1[i][j];
            }
        }
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.printf("%2d\t", m2[i][j]);
            }
            System.out.println("");
        }
        // Questão 6
        int mA[][] = new int[3][3];
        int mB[][] = new int[3][3];
        int c = 0;
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                System.out.print("Digite um valor: ");
                mA[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < mB.length; i++) {
            for (int j = 0; j < mB[i].length; j++) {
                System.out.print("Digite um valor: ");
                mB[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                if (mA[i][j] == mB[i][j]) {
                    c++;
                }
            }
        }
        if (c == 9) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }
        // Questão 7
        int m[][] = new int[4][4];
        int s = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == 0 || i > 2) {
                    s = s + m[i][j];
                }
            }
        }
        System.out.println("A soma da Linha L da matriz " + s);
        // Questão 8
        int m[][] = new int[12][12];
        int s = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
                if (i == 0 || i == 11 || j == 0) {
                    s += m[i][j];
                }

            }
        }
        System.out.print(s);
        // Questão 9
        int m[][] = new int[12][12];
        int s = 0;
        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m[j].length; i++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
                if (i > j) {
                    s += m[i][j];
                }
            }
        }
        System.out.println(s);
        // Questão 10
        int m[][] = new int[3][3];
        int s = 0;
        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m[j].length; i++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
                if (i < j) {
                    s += m[i][j];
                }
            }
        }
        System.out.println(s);
        // Questão 11
        int m[][] = new int[3][3];
        int s = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
                if (i > j) {
                    s += m[i][j];
                }
            }
        }
        System.out.println(s);
        // Questão 12
        int m[][] = new int[3][3];

        int s = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite um valor: ");
                m[i][j] = ler.nextInt();
                if (i < j) {
                    s += m[i][j];
                }
            }
        }
        System.out.println(s);*/
    }
}