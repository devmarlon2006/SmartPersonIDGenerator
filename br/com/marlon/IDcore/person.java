package br.com.marlon.IDcore;

public class person extends InfoClassElements {


    public person(String personName){

        name = personName;

    }

    public person (String personName, int personAge){
        name = personName;
        age = personAge;
    }

    public person (String personName, int personAge, String personBornCountry){
        bornCountry = personBornCountry;
        name = personName;
        age = personAge;
    }

    public person (String personName, int personAge, String personBornCountry, String personStateBornCountry){
        bornCountry = personBornCountry;
        stateBornCountry = personStateBornCountry;
        name = personName;
        age = personAge;
    }

}
