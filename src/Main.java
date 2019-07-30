public class Main {

    public static void main(String[] args) throws LimitException{
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(10000.00);
        while (true){
            bankAccount.withDraw(1000);
            System.out.println("Ваш остаток  " + bankAccount.getAmount());
        }



    }
}
