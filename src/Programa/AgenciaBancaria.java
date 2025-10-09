package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes() {

        System.out.println("--------------------------------------------------");
        System.out.println("--------------- Bem-vindo a nossa Agência ----------------");
        System.out.println("--------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("--------------------------------------------------");
        System.out.println("|   1 - Criar conta     |");
        System.out.println("|   2 - Depositar       |");
        System.out.println("|   3 - Sacar           |");
        System.out.println("|   4 - Transferir      |");
        System.out.println("|   5 - Listar contas   |");
        System.out.println("|   6 - Sair            |");

        int operacao = input.nextInt();
        
        switch(operacao) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;                
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Obrigado por utilizar nossa agência!");
                System.exit(0);

            default:
                System.out.println("Operação inválida!");
                operacoes();
                break;
        }
    }

    public static void criarConta() {

        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("\nEmail: ");
        String email = input.next();

        Pessoa pessoa = new Pessoa(nome, cpf, email);

        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);
        System.out.println("Sua conta foi criada com sucesso!");

        operacoes();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if (contasBancarias.size() > 0) {
            for (Conta c : contasBancarias) {
                if (c.getNumeroConta() == numeroConta);
                    conta = c;
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);
    }
}