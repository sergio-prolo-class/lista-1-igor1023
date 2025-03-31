/*
 * This source file was generated by the Gradle 'init' task
 * Desenvolvido pelo aluno Igor da Silva
*/

package org.example;

public class App {

    static void triangulo(int num) {

        // contadora para guardar a linha atual durante o laço for
        int linha = 0; 

        for (int i = 0; i < num; i++) {

            for (int j = num - i; j >= 1; j--) {
                System.out.printf(" ");
            }

            for (int k = 0; k < linha; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
            linha++;
        }

    }

    static void losango(int num) {

    }

    static void retangulo(int alt, int larg) {

        // Imprimir linha superior
        for(int i = 0; i < larg; i++)
            System.out.printf("*");

        System.out.printf("\n");

        // O algoritmo abaixo é responsável por imprimir as laterais do retangulo

        for(int i = 0; i < alt - 2; i++){

            System.out.printf("*");

            // j < larg - 2: subtraio 2 devido aos dois asteriscos laterais impressos
            for(int j = 0; j < larg - 2; j++)
                System.out.printf(" ");

            System.out.printf("*\n");    
        }

        // Imprimir linha inferior
        for(int i = 0; i < larg; i++)
            System.out.printf("*");

        System.out.printf("\n");
    }

    // Este método valida a entrada do usuario via linha de comando
    // retorna:
    //  - O nome da figura, em caso de sucesso
    //  - "0" em caso de erro
    static String valida_entrada(String entrada) {

        String figura = switch (entrada){

            case "triangulo" -> "triangulo";
            case "retangulo" -> "retangulo";
            case "losango" -> "losango";
            default -> "0";

        };

        return figura;
    }

    public static void main(String[] args) {

        //Validar numero de argumentos pela linha de comando
        if (args.length < 2) {
            System.out.println("Digitar: ./gradlew run --args=\"figura dimensao\" na pasta raíz do exercicio");
            return;
        }

        String figura = valida_entrada(args[0]);

        if (figura.equals("0")) {
            System.out.println("Erro: digitar no terminal \"gradle run --args nome_figura dimensoes\"");
            return;
        }

        // Se a entrada estiver errada, avisa e encerra imediatamente
        switch (figura) {

            case "triangulo": {
                int num = Integer.parseInt(args[1]);
                triangulo(num);
                break;
            }
            case "losango": {
                int num = Integer.parseInt(args[1]);
                losango(num);
                break;
            }
            case "retangulo": {
                int altura = Integer.parseInt(args[1]);
                int largura = Integer.parseInt(args[2]);
                retangulo(altura, largura);
            }
        }
    }
}