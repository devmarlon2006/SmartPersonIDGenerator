package br.com.marlon.Controller;
import br.com.marlon.Services.Bild;

public class CreacionController {

    String[] al;

    public void controllerIDCreacion(String n54, String nga){

        this.al = Bild.idNameBild( n54, nga );

    }

    public String[] getidToView(){
        return this.al;
    }
}
