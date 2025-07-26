package br.com.marlon.Controller.AplicationRun;

import br.com.marlon.Controller.CreacionController;
import br.com.marlon.IDcore.person;
import br.com.marlon.Services.ViewID;

public class MenuGet {

    public void menu() {

        Menu viewMenu = new Menu();
        boolean insetData = false;

        person view = new person();
        ViewID ad = new ViewID();
        CreacionController ctrl = new CreacionController();

        int opcao;

        do {

            opcao = viewMenu.menu();

            switch (opcao) {
                case 1:
                    view.setName();
                    view.setAge();
                    view.setState();
                    view.setBornCountry();
                    insetData = true;
                    System.out.println("Dados inseridos com sucesso!");
                    break;
                case 2:
                    if (insetData) {
                        System.out.println("ID:" + ad.view(ctrl.getidToView()));
                        System.out.println("Nome:" + view.getName());
                        System.out.println("Idade:" + view.getAge());
                        System.out.println("País:" + view.getBornCountry());
                        System.out.println("Estado:" + view.getState());
                    } else {
                        System.out.println("Por favor, insira os dados primeiro (Opção 1) para visualizar.");
                    }
                    break;
                case 3:
                    if (insetData) {
                        if (view.getName().isEmpty() || view.getState().isEmpty()) {
                            System.out.println("Informações Insuficientes para criar o ID. Por favor, preencha seus dados.");
                        } else {
                            ctrl.controllerIDCreacion(view.getName(), view.getState());
                            System.out.println("ID criado com sucesso!");
                        }
                    } else {
                        System.out.println("Por favor, insira os dados primeiro (Opção 1) para criar um ID. ️");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma das opções disponíveis.");
                    break;
            }
            System.out.println("------------------------------------");
            System.out.println();

        } while (opcao != 0);

    }
}
