/*
 * DESAFIO DE PROGRAMAÇÃO: Formatação de Entrada e Saída
 *
 * [Formato de Entrada]
 * - Cada linha de entrada conterá uma String seguida por um número inteiro.
 * - Cada String terá um máximo de caracteres alfabéticos, e cada número inteiro
 *   estará no intervalo inclusivo de 0 a 100099.
 *
 * [Formato de Saída]
 * - Em cada linha de saída, deve haver duas colunas:
 *
 * - A primeira coluna contém a String, alinhada à esquerda usando exatamente
 *   15 caracteres (com espaços em branco preenchendo à direita).
 *
 * - A segunda coluna contém o número inteiro, expresso em exatamente 3 dígitos;
 *   se a entrada original tiver menos do que três dígitos, você deve preencher
 *   os dígitos iniciais com zeros (ex: 65 vira 065).
 *
 * [Exemplo de Entrada]
 * java 100
 * cpp 65
 * python 50
 *
 * [Exemplo de Saída Esperada]
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 */

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            // O regex ".{1,15} garante que o Scanner pegue no máximo 15 caracteres.
            String s1 = in.next(".{1,15}");
            int x = in.nextInt();

            // Formato Saída
            // %-15s -> Alinha a String s1 à esquerda ocupando exatamente 15 caracteres de espaço
            // %03d  -> Imprime o número inteiro x, com no mínimo 3 dígitos. Se o número for menor (ex. 7), ele preenche com zeros à esquerda(007).
            // %n    -> Quebra de linha de forma automática
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}