/*
 * Desafio: Java Loops II (HackerRank)
 *
 * Descrição:
 * Você receberá q consultas contendo três inteiros a, b e n.
 * Para cada consulta, você deve imprimir a série de n termos na forma de
 * inteiros separados por espaço. O i-ésimo termo da série é calculado como:
 * s_i = a + sum_{j=0}^{i} (2^j * b)
 *
 * Exemplo de Entrada:
 * 2
 * 0 2 10
 * 5 3 5
 *
 * Exemplo de Saída:
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 */

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        // Cria um objeto 'Scanner' para ler a entrada padrão (teclado).
        Scanner in = new Scanner(System.in);

        // LEITURA DO NÚMERO DE CONSULTAS:
        // O primeiro número informado na entrada diz quantas vezes o bloco de cálculo vai rodar.
        int t = in.nextInt();

        // LAÇO EXTERNO (Casos de Teste / Consultas)
        // Este loop vai repetir o processo para cada uma das consultas informadas em 't'.
        for (int i = 0; i < t; i++) {

            // (Opcional para estudo local, remover para envio no HackerRank)
            System.out.print("Insira o valor base (a): \n");
            int a = in.nextInt();

            // (Opcional para estudo local)
            System.out.print("Insira o multiplicador base (b): \n");
            int b = in.nextInt();

            // (Opcional para estudo local)
            System.out.print("Insira a quantidade de números da sequência (n): \n");
            int n = in.nextInt();


            // INICIALIZAÇÃO DAS VARIÁVEIS DE CÁLCULO
            // 'current' armazena o valor acumulado da série, começando em 'a'
            int current = a;

            // 'term' armazena o pedaço que será somado a cada passo.
            // Começa valendo 'b' (equivalente a b * 2^0).
            int term = b;

            // LAÇO INTERNO (Geração da Série):
            // Este loop roda 'n' vezes para calcular e imprimir cada termo individualmente.
            for (int j = 0; j < n; j++) {

                // Passo 1: Soma o termo atual ao acumulador da série.
                current = current + term;

                // Passo 2: Imprime o número gerado seguido de um espaço (sem pular linha).
                System.out.print(current + " ");

                // Passo 3: Dobra o valor do termo para a próxima volta (simula as potências de 2: 1, 2, 4, 8...).
                term = term * 2;
            }
            // QUEBRA DE LINHA:
            // Após terminar de imprimir os 'n' termos de uma consulta,
            // pula para a próxima linha para organizar a saída da próxima série.
            System.out.println();
        }
        // ENCERRAMENTO:
        // Fecha o Scanner para liberar os recursos de entrada do sistema.
        in.close();

    }
}
