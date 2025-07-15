import br.com.marlon.BildID.Bild;
import br.com.marlon.IDcore.person;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        person view = new person();
        Scanner in = new Scanner(System.in);

        view.name21();
        view.age21();
        view.country21();
        view.stateBornCountry21();

       // Bild.idNameBild();


        System.out.println();

        System.out.println( "ID:" + Bild.idNameBild(view.getName(),view.getState()));
        System.out.println( "Nome:" + view.getName());
        System.out.println( "Idade:" +view.getAge());
        System.out.println( "País:" + view.getBornCountry());
        System.out.println( "Estado:" +view.getState());

        System.out.println("Pressione ENTER para continuar:");
        in.nextLine();

        in.close();



    }
}
