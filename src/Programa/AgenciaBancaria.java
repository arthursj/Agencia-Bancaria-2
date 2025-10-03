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
    }
}