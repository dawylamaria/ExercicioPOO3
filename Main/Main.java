package br.com.atividade.poo.Main;
import br.com.atividade.poo.Model.ContaBancaria;
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(
                "Bradesco",
                "123",
                "458",
                "1234",
                1000.00);

        ContaBancaria contaBancaria2 = new ContaBancaria(
                "Caixa",
                "778",
                "455",
                "789",
                1000.00);
       contaBancaria1.depositarDinheiro(100);
       contaBancaria2.depositarDinheiro(100);

       contaBancaria1.transferir(contaBancaria2,100);
       contaBancaria2.transferir(contaBancaria1,100);

        }
    }
