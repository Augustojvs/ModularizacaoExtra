package modularizacaoextra;

import java.util.Scanner;

public class ModularizacaoExtra {

    static Scanner input = new Scanner(System.in);

    static int retornaMaiorMenor(int vet[], int tipRetorno) {
        int maior = 0, menor = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                tipRetorno = maior;
            }
            if (vet[i] < menor) {
                tipRetorno = menor;
            }
        }
        if (tipRetorno == 1) {
            return maior;
        }
        return menor;
    }

    static int retornaRestoDivisao(int a, int b) {
        return a - ((a / b) * b);

    }

    static double retornaIMC(double peso, double altura) {

        return peso / Math.pow(altura, 2);

    }

    static String retornaClassificacaoIMC(double peso, double altura) {
        double imc = retornaIMC(peso, altura);
        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Acima do peso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade severa";
        } else {
            return "Obesidade mórbida";
        }

    }

    static String retornaSituacaoAluno(int nota[]) {
        int media = 0, soma = 0;
        for (int i = 0; i < nota.length; i++) {
            System.out.println("informe uma nota");
            int num = input.nextInt();
            nota[i] = num;
        }
        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];
        }
        media = soma / nota.length;
        if (media <= 0 || media < 6) {
            return "Reprovado";
        } else if (media <= 6 || media < 7) {
            return "Em Recuperação";
        }
        return "Aprovado";
    }

    static String retornaNomeMes(int num) {
        switch (num) {
            case 1:
                return "Janeiro";

            case 2:
                return "Fevereiro";

            case 3:
                return "Março";

            case 4:
                return "Abril";

            case 5:
                return "Maio";

            case 6:
                return "Junho";

            case 7:
                return "Julho";

            case 8:
                return "Agosto";

            case 9:
                return "Setembro";

            case 10:
                return "Outubro";

            case 11:
                return "Novembro";

            case 12:
                return "Dezembro";

            default:
                return "Mês não encontrado";
        }

    }
    static String retornaStringTitleCase(String palavra){
        if (palavra == null || palavra.isEmpty()) {
            return palavra;
        }
        
        StringBuilder result = new StringBuilder();
        
        boolean convert = true;
        for (char ch : palavra.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convert = true;
            }else if (convert){
                ch = Character.toTitleCase(ch);
                convert = false;
            }else{
                ch = Character.toLowerCase(ch);
            }
            result.append(ch);
        }
        return result.toString();
    }
    static String retornaReverso (String palavra){
        return new StringBuilder(palavra).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(retornaReverso("ARIEIV OINUJ OTSUGUA"));
    }

}
