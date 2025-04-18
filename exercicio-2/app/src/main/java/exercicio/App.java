/*
 * This Java source file was generated by the Gradle 'init' task.
 * Desenvolvido pelo aluno Igor da Silva
*/
package exercicio;

public class App {
    
    static String numero_faixa(String faixa) {

        switch (faixa) {
            case "preto":    return "0";
            case "marrom":   return "1";
            case "vermelho": return "2";
            case "laranja":  return "3";
            case "amarelo":  return "4";
            case "verde":    return "5";
            case "azul":     return "6";
            case "violeta":  return "7";
            case "cinza":    return "8";
            case "branco":   return "9";
            default:         return "-1"; // Entrada inválida
        }

    }

    static float fator_multiplicador (String multiplicador) {

        switch(multiplicador){

            case "preto":    return 1.0f;          
            case "marrom":   return 10.0f;
            case "vermelho": return 100.0f;
            case "laranja":  return 1000.0f;        // 1 K
            case "amarelo":  return 10000.0f;       // 10 K 
            case "verde":    return 100000.0f;      // 100 K
            case "azul":     return 1000000.0f;     // 1 M
            case "violeta":  return 10000000.0f;    // 10 M
            case "cinza":    return 100000000.0f;   // 100 M
            case "branco":   return 1000000000.0f;  // 1 G
            case "ouro":     return 0.1f;
            case "prata":    return 0.01f;  
            default:         return 0.0f;           // Entrada inválida   

        }

    }

    static String valor_tolerancia (String valor_tolerancia) {

        switch (valor_tolerancia) {

            case "preto":    return "0%";
            case "marrom":   return "1%";
            case "vermelho": return "2%";
            case "laranha":  return " ";
            case "amarelo":  return " ";
            case "verde":    return "0,5%";
            case "azul":     return "0,25%";
            case "violeta":  return "0.1%";
            case "cinza":    return "0,05%";
            case "branco":   return " ";
            case "ouro":     return "5%";
            case "prata":    return "10%";
            case " ":        return "20%";
            default:         return "-1";

        }

    }

    public static void main(String[] args) {

        String valor_primeira_faixa = numero_faixa(args[0]);
        String valor_segunda_faixa = numero_faixa(args[1]);
        float multiplicador = fator_multiplicador(args[2]);
        String tolerancia = valor_tolerancia(args[3]);

        // Vou validar a entrada
        if(valor_primeira_faixa.equals("-1") || valor_segunda_faixa.equals("-1") ||
           multiplicador == 0.0f || tolerancia.equals("-1")) {

            System.out.println("Execute com gradle run \"cor1 cor2 cor3 cor4\"");
            return;

        }

        String resultado_str = valor_primeira_faixa + valor_segunda_faixa;
        int resultado_int = Integer.parseInt(resultado_str);
        resultado_int *= multiplicador;
        String resistencia = String.valueOf(resultado_int) + " +- " + tolerancia + " Ohm (s)";

        System.out.println(resistencia);

    }

}