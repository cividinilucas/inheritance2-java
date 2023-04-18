package entities;


 public class AccountBussines extends Account{

     /* Fazendo a heranca da classe Account para essa classe, fazendo ela herdar atributos e metodos */

     private Double loanLimit;

     public AccountBussines(){
     }

     public AccountBussines(Double loanLimit) {
         this.loanLimit = loanLimit;
     }


     /* Criado abaixo um construtor incluindo tambem argumentos da outra classe */
     public AccountBussines(Integer number, String holder, Double balance, Double loanLimit) {
         super(number, holder, balance);
         this.loanLimit = loanLimit;
     }

     public Double getLoanLimit() {
         return loanLimit;
     }

     public void setLoanLimit(Double loanLimit) {
         this.loanLimit = loanLimit;
     }


     public void loan(double amount) {
         if (amount <= loanLimit) {
             balance += amount - 10;
         }
     }
 }
