import entities.Account;
import entities.AccountBussines;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);

        AccountBussines bussAcc = new AccountBussines(1002, "Maria", 0.0, 500.0);



        //UpCasting - Atribuir BussinesAcc para Account:
        //Repare que uma conta empresarial tambem eh uma conta, por isso eh possivel criar uma variavel bussAcc do tipo Account
        Account acc1 = bussAcc;
        Account acc2 = new AccountBussines(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DownCasting - Processo inverso, convertendo um objeto da superclasse (nesse caso "Account") para a subclasse:
        //Repare que nao posso converter uma Bussiness acc para Account, por isso precisamos declarar qual a sub classe que estamos utilziando
        AccountBussines acc4 = (AccountBussines) acc2;
        acc4.loan(100.0);

        //Nao eh possivel fazer essa conversao pois uma conta Savings eh uma conta normal, mas nao uma conta empresarial.
        // AccountBussines acc5 = (AccountBussines) acc3;
        //Abaixo usamos a palavra "isntaceOf" para testar se a conta eh uma conta empresarial, para evitar que o erro acima acontessa.
        if(acc instanceof AccountBussines){
            AccountBussines acc5 = (AccountBussines) acc3;
            acc5.loan(200.0);
        }
        System.out.println();

    }
}