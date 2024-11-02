package teste;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        contaTerminal.setNumero(numeroConta);

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();
        contaTerminal.setAgencia(agencia);

        scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo:");
        String nome = scanner.nextLine();
        contaTerminal.setNomeCliente(nome);

        System.out.println("Por favor, digite seu saldo para depósito:");
        if (scanner.hasNextDouble()) {
            double saldo = scanner.nextDouble();
            contaTerminal.setSaldo(saldo);
        } else {
            System.out.println("Entrada inválida! Por favor, insira um número decimal.");
            scanner.next();
        }

        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco. Sua agência é: "
                + contaTerminal.getAgencia() + ", conta: " + contaTerminal.getNumero() + " e seu saldo: R$ "
                + contaTerminal.getSaldo() + " já está disponível para saque.");

        scanner.close();
    }
}
