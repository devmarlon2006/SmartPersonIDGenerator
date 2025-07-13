import br.com.marlon.BildID.Bild;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Bild bild = new Bild();

        String info = bild.idNameBild();

        System.out.println(info);

        System.out.println("Pressione ENTER para continuar:");
        String pressione = in.nextLine();

        in.close();



    }
}
