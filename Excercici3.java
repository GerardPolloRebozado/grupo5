import java.util.Scanner;

public class Excercici3 {
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        float costInicial = 0.0f , costFinal = 0.0f, preuVenda = 0.0f;
        boolean bonEstat;


        System.out.println("Benvingut");
        System.out.print("Escriu el cost de la compra actual: ");
        costInicial = llegir.nextFloat();

        System.out.print("La figura esta en bon estat? (false | true) ");
        bonEstat = llegir.nextBoolean();

        if(bonEstat == false) {

            preuVenda = costInicial * 1.25f;

        }else {
            preuVenda = costInicial * 1.10f;
        }
        System.out.println("El preu de venda d ela figura es " + preuVenda);
       

    }
}
