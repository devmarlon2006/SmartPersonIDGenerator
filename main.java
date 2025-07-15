import br.com.marlon.Controller.CreacionController;
import br.com.marlon.IDcore.person;
import br.com.marlon.Services.ViewID;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        person view = new person();
        Scanner in = new Scanner(System.in);
        ViewID ad = new ViewID();
        CreacionController ctrl = new CreacionController();

        view.name21();
        view.age21();
        view.country21();
        view.stateBornCountry21();
        ctrl.controllerIDCreacion(view.getName(), view.getState());


       // Bild.idNameBild();


        System.out.println();

        System.out.println( "ID:" + ad.view( ctrl.getidToView()));
        System.out.println( "Nome:" + view.getName());
        System.out.println( "Idade:" +view.getAge());
        System.out.println( "País:" + view.getBornCountry());
        System.out.println( "Estado:" +view.getState());

        System.out.println("Pressione ENTER para continuar:");
        in.nextLine();

        in.close();



    }
}
