import java.util.Scanner;
/*
 * =====================================================================
 *  ESTUDO
 * =====================================================================
 *
 * O Java possui 8 tipos de dados primitivos:
 *   char, boolean, byte, short, int, long, float e double.
 *
 * Neste exercício trabalhamos apenas com os primitivos usados para
 * guardar números inteiros:
 *
 *   Tipo   | Tamanho | Menor valor                 | Maior valor
 *   -------+---------+-----------------------------+----------------------------
 *   byte   |  8 bits | -128                        | 127
 *   short  | 16 bits | -32.768                     | 32.767
 *   int    | 32 bits | -2.147.483.648              | 2.147.483.647
 *   long   | 64 bits | -9.223.372.036.854.775.808  | 9.223.372.036.854.775.807
 *
 * Todos são inteiros COM SINAL (aceitam valores negativos e positivos).
 *
 * Dado um número inteiro de entrada, é preciso descobrir quais desses
 * tipos conseguem armazená-lo corretamente.
 *
 * Ideia-chave: cada tipo maior "contém" o intervalo do menor. Por isso,
 * se um número cabe em byte, ele também cabe em short, int e long.
 *
 * Referência:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */

/*
 * =====================================================================
 *  DESAFIO
 * =====================================================================
 *
 * Dado um inteiro n (que pode ser arbitrariamente grande ou pequeno),
 * determine em quais primitivos (byte, short, int, long) ele pode ser
 * armazenado.
 *
 * Formato de entrada:
 *   - A primeira linha contém um inteiro t, o número de casos de teste.
 *   - Cada caso de teste é uma linha com um inteiro n.
 *
 * Formato de saída:
 *   - Se n couber em algum dos tipos, imprima:
 *
 *         n can be fitted in:
 *         * dataType
 *
 *     Se mais de um tipo servir, imprima um por linha, ordenados por
 *     tamanho: byte < short < int < long.
 *
 *   - Se n não couber em nenhum dos quatro, imprima:
 *
 *         n can't be fitted anywhere.
 *
 * Exemplo de entrada:
 *   5
 *   -150
 *   150000
 *   1500000000
 *   213333333333333333333333333333333333
 *   -100000000000000
 *
 * Exemplo de saída:
 *   -150 can be fitted in:
 *   * short
 *   * int
 *   * long
 *   150000 can be fitted in:
 *   * int
 *   * long
 *   1500000000 can be fitted in:
 *   * int
 *   * long
 *   213333333333333333333333333333333333 can't be fitted anywhere.
 *   -100000000000000 can be fitted in:
 *   * long
 */

public class JavaDatatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x <= Long.MAX_VALUE) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
