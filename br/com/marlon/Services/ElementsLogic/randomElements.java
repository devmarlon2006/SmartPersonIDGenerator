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

        return random1.nextInt(9);
    }

    static int elementRandom2(){
        Random random2 = new Random();

        return random2.nextInt(9);
    }

    public static String element2Con(int number){


        int result;

        do{


            result = elementRandom1() + elementRandom2();


        }while (result > number );


        return Integer.toString( result );

    }


    public static String elementRandom3(String username){

        if (username == null){
            return "0";
        }

        int name = username.length() ;

        if (name > 9){
            return "9";
        }else{
            return Integer.toString( name );
        }

    }
}
