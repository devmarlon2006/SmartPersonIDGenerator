package br.com.marlon.Controller.AplicationRun;

import br.com.marlon.Controller.CreacionController;


import java.util.Scanner;

public class Menu {
    public int menu(){
        CreacionController ctrl = new CreacionController();

        System.out.println("------Sistema de cadastro do usuário------");

        Scanner in = new Scanner(System.in);

        System.out.println();

        System.out.println("Opção (1):Cadastrar Usuário");
        System.out.println("Opção (2):Ver dados do usuário");
        System.out.println("Opção (3): Gerar ID apartir das informaçõe");
        System.out.println("Opção (0):Sair do gerador");
        System.out.println();
        System.out.print("Insira a opção:");

        return in.nextInt();
    }
}
