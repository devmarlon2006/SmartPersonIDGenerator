package br.com.marlon.IDcore;

import br.com.marlon.Controller.UserInput;

public class person extends InfoClassElements {

    int age21() {
        InfoClassElements infoClassElements = new InfoClassElements();
        new UserInput();
        int agert = UserInput.ageIN();
        return infoClassElements.setAge( agert );
    }

    String country21() {
        InfoClassElements infoClassElements = new InfoClassElements();
        new UserInput();
        String  country776 = UserInput.CountryIN();
        return infoClassElements.setBornCountry( country776 );
    }

    String stateBornCountry21() {
        InfoClassElements infoClassElements = new InfoClassElements();
        new UserInput();
        String  State553 = UserInput.stateIN();
        return infoClassElements.setStateBornCountry( State553 );
    }

    String name21() {
        InfoClassElements infoClassElements = new InfoClassElements();
        new UserInput();
        String  name654 = UserInput.nameIN();
        return infoClassElements.setName(name654);
    }

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
        return this.stateBornCountry;
    }

    public void setBornCountry() {
        this.bornCountry = this.country21();
    }

    public void setName() {
        this.name = this.name21();
    }

    public void setState() {
        this.stateBornCountry = this.stateBornCountry21();
    }

    public void setAge() {
        this.age = this.age21();
    }


}
