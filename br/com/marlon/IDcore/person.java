package br.com.marlon.IDcore;

import br.com.marlon.InputInfo.UserInput;

public class person extends InfoClassElements {

    public int age21() {
        new UserInput();
        int agert = UserInput.ageIN();
        return this.age = agert;
    }

    public String country21() {
        new UserInput();
        String  country776 = UserInput.CountryIN();
        return this.bornCountry = country776;
    }

    public String stateBornCountry21() {
        new UserInput();
        String  State553 = UserInput.stateIN();
        return this.stateBornCountry = State553;
    }

    public String name21(){
        new UserInput();
        String  name654 = UserInput.nameIN();
        return this.name = name654;
    }


    // ... seus métodos existentes ...

    public int getAge() {
        return this.age;
    }

    public String getBornCountry() {
        return this.bornCountry;
    }


    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.name;
    }



}
