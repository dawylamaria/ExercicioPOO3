package br.com.atividade.poo.Model;
import java.util.Scanner;
public class ContaBancaria {

    public String instituicaoFinanceira;
    public String titularDaConta;
    public String agencia;
    public String conta;
    public String cpf;
    public double valorEmConta;

    public ContaBancaria(String instituicaoFinanceira, String agencia,
                         String conta, String cpf, double valorEmConta){
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.titularDaConta = instituicaoFinanceira;
        this.agencia = agencia;
        this.conta = conta;
        this.cpf = cpf;
        this.valorEmConta = valorEmConta;

    }

    public void depositarDinheiro (double valor){
        this.valorEmConta += valor;
        System.out.println("Novo saldo:" + valorEmConta);
    }
    public void retirarDinheiro (double valor){
        if(valor <= valorEmConta){
            valorEmConta -= valor;
            System.out.println("novo saldo:" + valorEmConta);
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public boolean transferir(ContaBancaria outraConta, double valor){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite os dados indicados abaixo para transferência:");
        String agenciaTransferencia, contaTransferencia, cpfTransferencia;

        System.out.print("\nAgência: ");
        agenciaTransferencia = scan.nextLine();

        System.out.print("Conta: ");
        contaTransferencia = scan.nextLine();

        System.out.print("CPF: ");
        cpfTransferencia = scan.nextLine();

            if(agenciaTransferencia.equals(outraConta.agencia) &&
            contaTransferencia.equals(outraConta.conta) &&
            cpfTransferencia.equals(outraConta.cpf)){
                if(valor <= valorEmConta){
                    valorEmConta -= valor;
                    outraConta.depositarDinheiro(valor);
                    System.out.printf("o valor transferido foi: %.2f", valor);
                    return true;
                }else{
                    System.out.println("Saldo insuficiente!");
                    return false;
                }
            }else{
                System.out.println("Não foi possível realizar transferência!");
                return false;

            }

    }

}
