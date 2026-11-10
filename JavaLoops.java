import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * =====================================================================
 *  ESTUDO
 * =====================================================================
 *
 * Laços de repetição (loops) permitem executar um mesmo bloco de código
 * várias vezes, sem precisar escrevê-lo repetidamente.
 *
 * O Java possui três estruturas principais:
 *   - for       -> quando sabemos quantas vezes repetir
 *   - while     -> repete enquanto a condição for verdadeira
 *   - do-while  -> igual ao while, mas executa pelo menos uma vez
 *
 * Estrutura do for:
 *
 *   for (inicialização; condição; atualização) {
 *       // bloco repetido
 *   }
 *
 *   1. inicialização: executada uma única vez (ex.: int i = 1)
 *   2. condição: testada antes de cada repetição (ex.: i <= 10)
 *   3. atualização: executada ao final de cada repetição (ex.: i++)
 *
 * Formatação de saída com printf:
 *   %d -> insere um número inteiro
 *   %n -> quebra de linha independente do sistema operacional
 *
 * Operador de multiplicação: *   (ex.: N * i)
 */

/*
 * =====================================================================
 *  DESAFIO
 * =====================================================================
 *
 * Objetivo:
 *   Usar laços de repetição para fazer contas simples.
 *
 * Tarefa:
 *   Dado um inteiro N, imprima seus 10 primeiros múltiplos. Cada
 *   múltiplo N x i (onde 1 <= i <= 10) deve ser impresso em uma nova
 *   linha, no formato:
 *
 *       N x i = resultado
 *
 * Formato de entrada:
 *   Um único inteiro, N.
 *
 * Formato de saída:
 *   Imprima 10 linhas; cada linha i (onde 1 <= i <= 10) contém o
 *   resultado de N x i no formato: N x i = resultado.
 *
 * Exemplo de entrada:
 *   2
 *
 * Exemplo de saída:
 *   2 x 1 = 2
 *   2 x 2 = 4
 *   2 x 3 = 6
 *   2 x 4 = 8
 *   2 x 5 = 10
 *   2 x 6 = 12
 *   2 x 7 = 14
 *   2 x 8 = 16
 *   2 x 9 = 18
 *   2 x 10 = 20
 */

/*
 * =====================================================================
 *  RESPOSTA
 * =====================================================================
 *
 * Estratégia:
 *   1. Ler o número N da entrada padrão com BufferedReader.
 *   2. Usar um for de i = 1 até i = 10 (inclusive).
 *   3. A cada volta, calcular N * i e imprimir no formato pedido.
 *   4. Fechar o leitor somente DEPOIS do laço terminar.
 *
 * Observações:
 *   - Não imprimimos mensagens como "Enter a number:", pois o HackerRank
 *     compara a saída caractere por caractere e qualquer texto extra
 *     faz a resposta ser considerada errada.
 *   - Usamos %n em vez de "\n" e removemos o espaço sobrando antes da
 *     quebra de linha, para a saída ficar idêntica à esperada.
 */

public class JavaLoops {
    public static void main(String[] args) throws IOException {

        // BufferedReader -> Cria um leitor otimizado que armazena os dados em memória (buffer) para ler textos de forma muito rápida
        // InputStreamReader -> Converte o fluxo de bytes brutos que vêm do teclado em caracteres de texto reconhecíveis
        // System.in -> Captura a entrada padrão do sistema, ou seja, tudo o que o usuário digita no console/teclado
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Lê uma linha inteira do console, remove os espaços invisíveis das pontas,
        // converte o texto para um número inteiro e guarda o resultado na variável 'N'.
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            int multiples = N * i;
            System.out.printf("%d x %d = %d%n", N, i, multiples);
        }
        bufferedReader.close();
    }
}
