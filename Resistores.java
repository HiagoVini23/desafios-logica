import java.util.Scanner;

public class Resistores {
    public static void main(String[] args) {

        double numero = 0;
        StringBuilder respostaFinal = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String numeroComOhms, numeroString;
        String[] codigos = {"preto", "marrom", "vermelho", "laranja", "amarelo", "verde", "azul", "violeta", "cinza", "branco"};
        
        System.out.print("Digite o número de ohms:...");
        numeroComOhms = scanner.nextLine();
        
        //tira o texto ohms irrelevante
        numeroString = numeroComOhms.split(" ")[0];
        numeroString = numeroString.toLowerCase();
        
        if(numeroString.contains("k")){
            numeroString = numeroString.replace("k", "");
            numero = Double.parseDouble(numeroString)*1000; 
        }else if(numeroString.contains("m")){
            numeroString = numeroString.replace("m", "");
            numero = Double.parseDouble(numeroString)*1000000;      
        }

        //Reconverte para string
        numeroString = String.valueOf(numero); 

        //cores para a primeira e segunda banda
        for(int i = 0; i< 2; i++){
            int index = Character.getNumericValue(numeroString.charAt(i));
            respostaFinal.append(codigos[index] + ' ');
        }

        //cor para terceira banda
        numeroString = numeroString.split("\\.")[0];
        respostaFinal.append(codigos[numeroString.length()-2] + ' ');

        //cor para a ultima banda
        respostaFinal.append("dourado");
        System.out.println(respostaFinal);

    }
}
