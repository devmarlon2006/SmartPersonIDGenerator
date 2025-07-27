package br.com.marlon.Controller;
import br.com.marlon.Services.Bild;

public class CreacionController {

    String[] al;

    public void controllerIDCreacion(String userName, String userState, String userCountry, int userAge){

        this.al = Bild.idNameBild( userName, userState, userCountry, userAge );

    }

    public String[] getidToView(){
        return this.al;
    }
}
