package br.com.marlon.InputInfo;
import java.util.Scanner;


public class UserInput {

    public String nameIN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String InputName = scanner.nextLine();

        return InputName;
    }

    public int ageIN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int InputAge = scanner.nextInt();

        return InputAge;
    }

    public String CountryIN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Country: ");
        String InputCountry = scanner.nextLine();

        return InputCountry;
    }

    public String stateIN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter State: ");
        String InputState = scanner.nextLine();

        return InputState;
    }




}
