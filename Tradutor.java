import java.util.Scanner;

public class Tradutor {

  static String traduzido = "";

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String[] tradutor = {
        "Love:Amo", "Stick:Graveto", "Deus:God"};
      
      System.out.println("Digite oque quer traduzir ");
      traduzido = scan.next();

      for(int i = 0; i < tradutor.length; i++) {
        String[] vector =  tradutor[i].split(":");
      if(traduzido.equals(vector[0])) {
        System.out.println("Tradução: " + vector[1]);
      } else if(traduzido.equals(vector[1])) {
        System.out.println("Tradução: " + vector[0]);
      }
    }
      System.out.println("Deseja traduzir mais algo? (s/n)");
      char continuar = scan.next().charAt(0);
      if(continuar == 'n') {
        System.out.println("\nPrograma finalizado!\n");
      } else {
        main(args);
      }
     }
    }