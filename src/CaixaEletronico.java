import java.util.Scanner;

public class CaixaEletronico {
    private static double saldo = 1000.0; // Saldo inicial da conta fictícia

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Caixa Eletronico");
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Caixa Eletrônico");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Fazer Saque");
            System.out.println("3. Fazer Depósito");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    verificarSaldo();
                    break;
                case 2:
                    fazerSaque();
                    break;
                case 3:
                    fazerDeposito();
                    break;
                case 4:
                    System.out.println("Obrigado por usar o caixa eletrônico!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);

        scanner.close();
    }

    private static void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    private static void fazerSaque() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do saque: R$");
        double valorSaque = scanner.nextDouble();

        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " efetuado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    private static void fazerDeposito() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: R$");
        double valorDeposito = scanner.nextDouble();

        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " efetuado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
}