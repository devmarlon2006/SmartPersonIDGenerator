package br.com.marlon.Services.ElementsLogic;
import java.util.Random;


public class randomElements {
    public static char  elementRandom(String enterElement){
        Random random0 = new Random();

        int randomIndex = random0.nextInt(enterElement.length());


        return enterElement.charAt(randomIndex);
    }


    public static char elementRandom1(){
        Random random1 = new Random();

        int randomIndex = random1.nextInt(9);

        return (char)randomIndex;
    }

    public static char elementRandom2(){
        Random random2 = new Random();

        int randomIndex = random2.nextInt(9);

        return (char)randomIndex;
    }
}
