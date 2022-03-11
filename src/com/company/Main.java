package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setNumberAccount(123456);
        bankAccount1.setOwnerAccount("Zé maguinho do Piaui");
        bankAccount1.openAccount("CC");


        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setNumberAccount(789456);
        bankAccount2.setOwnerAccount("Manoel gomes caneta azul");
        bankAccount2.openAccount("CP");

        bankAccount1.depositMoney(0);//metodos para depositar dinheiro.
        bankAccount2.depositMoney(1);


        bankAccount1.StatusAccount();
        bankAccount2.StatusAccount();

    }
}
