import java.util.Scanner;

public class Excercici3 {
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        float costInicial = 0.0f , costFinal = 0.0f, preuVenda = 0.0f;
        boolean bonEstat;


        System.out.println("bienvenido al programa.");
        System.out.print("Escriu l'import de la compra actual: ");
        costInicial = llegir.nextFloat();

        System.out.print("La figura esta en bon estat? Respon amb true | false ");
        bonEstat = llegir.nextBoolean();

        if(bonEstat == true) {

            preuVenda = costInicial * 1.25f;

        }else {
            preuVenda = costInicial * 1.10f;
        }
        System.out.println("El preu de venda d ela figura es " + preuVenda);
        System.out.println("Adios");
        

    }
}
