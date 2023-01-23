import java.util.Scanner;

public class Excercici3 {
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        float costInicial = 0.0f , costFinal = 0.0f, preuVenda = 0.0f;
        boolean malEstat;


        System.out.println("Benvingut/da al programa.. ");
        System.out.print("Escriu l'import de la figura que has comprat: ");
        costInicial = llegir.nextFloat();

        System.out.print("La figura esta en mal estat? (true | false) ");
        bonEstat = llegir.nextBoolean();

        if(malEstat == true) {
          

            preuVenda = costInicial * 5.50f;

        }else {
            preuVenda = costInicial * 2.50f;
        }
        System.out.println("El preu de venda d ela figura es " + preuVenda);

    }
}
