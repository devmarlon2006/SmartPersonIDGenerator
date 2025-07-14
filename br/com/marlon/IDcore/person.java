package br.com.marlon.IDcore;

public class person extends InfoClassElements {

    public person (String personName, int personAge, String personBornCountry, String personStateBornCountry){
        this.bornCountry = personBornCountry;
        this.stateBornCountry = personStateBornCountry;
        this.name = personName;
        this.age = personAge;
    }

}
