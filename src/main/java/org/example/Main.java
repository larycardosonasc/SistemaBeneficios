package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        int tempoEmpresa;
        int filhos;
        String modalidade;
        String veiculo;

        System.out.println("=== SISTEMA DE CONSULTA DE BENEFÍCIOS ===");

        System.out.print("Nome do colaborador: ");
        nome = entrada.nextLine();

        System.out.print("Idade: ");
        idade = entrada.nextInt();

        System.out.print("Salário: R$ ");
        salario = entrada.nextDouble();

        System.out.print("Tempo de empresa (em anos): ");
        tempoEmpresa = entrada.nextInt();

        System.out.print("Quantidade de filhos: ");
        filhos = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Modalidade de trabalho (presencial/home office): ");
        modalidade = entrada.nextLine();

        System.out.print("Utiliza veículo próprio? (sim/nao): ");
        veiculo = entrada.nextLine();

        System.out.println();
        System.out.println("=== RESULTADO ===");
        System.out.println("Colaborador: " + nome);

        if (salario <= 5000) {
            System.out.println("Vale-alimentação: SIM");
        } else {
            System.out.println("Vale-alimentação: NAO");
        }

        if (filhos > 0) {
            System.out.println("Auxílio-creche: SIM");
        } else {
            System.out.println("Auxílio-creche: NAO");
        }

        if (idade >= 18 && salario <= 10000) {
            System.out.println("Plano de saúde: SIM");
        } else {
            System.out.println("Plano de saúde: NAO");
        }

        if (modalidade.equalsIgnoreCase("home office")) {
            System.out.println("Auxílio home office: SIM");
        } else {
            System.out.println("Auxílio home office: NAO");
        }

        if (modalidade.equalsIgnoreCase("presencial")
                && veiculo.equalsIgnoreCase("sim")) {
            System.out.println("Auxílio combustível: SIM");
        } else {
            System.out.println("Auxílio combustível: NAO");
        }

        if (tempoEmpresa >= 1) {
            System.out.println("Participação na PLR: SIM");
        } else {
            System.out.println("Participação na PLR: NAO");
        }

        if (salario <= 4000 && tempoEmpresa >= 1) {
            System.out.println("Bolsa de estudos: SIM");
        } else {
            System.out.println("Bolsa de estudos: NAO");
        }

        entrada.close();
    }
}