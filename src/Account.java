public class Account {
    private String name;
    private double saldo;
    private Account next;

    public Account(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public void setNext(Account next) {
        this.next = next;
    }

    public double getSaldo() {
        return saldo;
    }

    public Account getNext() {
        return next;
    }

    public String getName() {
        return name;
    }

    public void deposit(double jumlah) {
        this.saldo += jumlah;
    }

    public void withdraw(double jumlah) {
        if (jumlah <= this.saldo) {
            this.saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
