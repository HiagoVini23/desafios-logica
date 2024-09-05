import java.util.ArrayList;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de linhas e colunas
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        // Cria a matriz
        int[][] matriz = new int[linhas][colunas];

        // Preenche a matriz com os valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        //pula linha
        System.out.println();
        ArrayList<Integer> resposta = new ArrayList<>();
        int n = 0, m = matriz.length - 1;
        
        // Enquanto n e m forem diferentes
        while (n <= m) {
            varreLinha(matriz, n, matriz[0].length, resposta, true);  // Varre da esquerda para a direita
            varreColuna(matriz, m, matriz.length, resposta, true);    // Varre de cima para baixo
            if (n != m) {  // Evita varrer a mesma linha/coluna duas vezes
                varreLinha(matriz, m, matriz[0].length, resposta, false);  // Varre da direita para a esquerda
                varreColuna(matriz, n, matriz.length, resposta, false);    // Varre de baixo para cima
            }
            n++;
            m--;
        }

        System.out.println(resposta);  
    }

    public static void varreLinha(int[][] matriz, int linha, int ultimaColuna, ArrayList<Integer> resposta, boolean leftToRight) {
        if (leftToRight) {
            // Varre da esquerda para a direita
            for (int i = 0; i < ultimaColuna; i++) {
                if (matriz[linha][i] == -1) {
                    continue;  // Ignora os elementos que já foram vistos
                }
                resposta.add(matriz[linha][i]);
                matriz[linha][i] = -1;  // Marca o elemento da matriz como visto
            }
        } else {
            // Varre da direita para a esquerda
            for (int i = ultimaColuna - 1; i >= 0; i--) {
                if (matriz[linha][i] == -1) {
                    continue;  // Ignora os elementos que já foram vistos
                }
                resposta.add(matriz[linha][i]);
                matriz[linha][i] = -1;  // Marca o elemento da matriz como visto
            }
        }
    }

    public static void varreColuna(int[][] matriz, int coluna, int ultimaLinha, ArrayList<Integer> resposta, boolean topToBottom) {
        if (topToBottom) {
            // Varre de cima para baixo
            for (int i = 0; i < ultimaLinha; i++) {
                if (matriz[i][coluna] == -1) {
                    continue;  // Ignora os elementos que já foram vistos
                }
                resposta.add(matriz[i][coluna]); 
                matriz[i][coluna] = -1;  // Marca o elemento da matriz como visto
            }
        } else {
            // Varre de baixo para cima
            for (int i = ultimaLinha - 1; i >= 0; i--) {
                if (matriz[i][coluna] == -1) {
                    continue;  // Ignora os elementos que já foram vistos
                }
                resposta.add(matriz[i][coluna]);
                matriz[i][coluna] = -1;  // Marca o elemento como visto
            }
        }
    }
}