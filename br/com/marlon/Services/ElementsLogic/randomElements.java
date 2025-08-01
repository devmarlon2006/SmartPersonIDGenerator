package br.com.marlon.Services.ElementsLogic;


import java.util.Random;


public class randomElements {
    public static char  elementRandom(String name){
        Random random0 = new Random();

        int randomIndex = random0.nextInt(name.length());


        return name.charAt(randomIndex);
    }


    static int elementRa1(){
        Random random1 = new Random();

        return random1.nextInt(9);
    }

    static int elementRa2(){
        Random random2 = new Random();

        return random2.nextInt(9);
    }

    public static String element2Con(int number){


        int result;

        do{


            result = elementRa1() + elementRa2();


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

    public static String elementRandom4(int age){

        Random random5 =  new Random();
        
        double res;


        do{
            if (age >= 25){
                res = Math.pow(age,1.5) - random5.nextInt(10) + 34 * 0.1 / random5.nextInt(5);
            }else{
                res = Math.pow(age,2) - random5.nextInt(10) + 34 * 0.1 / 10;
            }

        }while ( res <= 9);

        return Integer.toString( (int) res );

    }

    public static String elementRandom5(int age){

        Random random = new Random();
        double res;

        do{
            if (age >= 50){
                res = age * 2 / random.nextDouble(0.9) * random.nextDouble(0.9);
            }else{
                res = age / random.nextDouble(0.9) * random.nextDouble(0.9);
            }

        }while(res >= 9);


        return Integer.toString( (int) res );
    }

    public static String elementRandom6(int age){

        if (age < 10){
            return  "%02" + age ;
        }else {
            return Integer.toString( age );
        }

    }

    public static char elementRandom7(){
        Random random = new Random();
        String character;
        char result;
        
        character = "ABCDEFGHIJKLMNOPKRSTUVWXWZabcdefghijklmnopqrstuvwxyz12345";
        result = character.charAt( random.nextInt(24) );

        return result;
    }


}
