public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;

    }

    public void deposit(double sum) {
        System.out.println("Ваш балланс " + amount);
        amount = amount + sum;
        System.out.println("Ваш новый Баланс: " + amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Остаток меньше, чем запрашиваемая сумма", amount);

        }
        amount = amount - sum;
    }
}
