package br.com.marlon.BildID;
import java.util.Random;

public class randomElements {
    public static char  elementRandom(String enterElement){
        Random random = new Random();

        int randomIndex = random.nextInt(enterElement.length());


        return enterElement.charAt(randomIndex);
    }
}
