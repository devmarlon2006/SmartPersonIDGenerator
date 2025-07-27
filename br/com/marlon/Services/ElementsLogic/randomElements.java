package br.com.marlon.Services.ElementsLogic;
import java.util.Random;


public class randomElements {
    public static char  elementRandom(String enterElement){
        Random random0 = new Random();

        int randomIndex = random0.nextInt(enterElement.length());


        return enterElement.charAt(randomIndex);
    }


    static int elementRandom1(){
        Random random1 = new Random();

        int randomIndex = random1.nextInt(9);

        return (char)randomIndex;
    }

    static int elementRandom2(){
        Random random2 = new Random();

        int randomIndex = random2.nextInt(9);

        return (char)randomIndex;
    }

    public static String element2Con(){


        int result;

        do{

            result = elementRandom1() + elementRandom2();


        }while (result > 10 );


        return Integer.toString( result );

    }
}
