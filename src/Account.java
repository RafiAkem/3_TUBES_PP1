public class Account {
    private String name;
    private double saldo;
    private Account next;

    // konstruktor untuk menginisialisasi nama dan saldo
    public Account(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    // setter dan getter
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

    // method deposit dimana saldo akan bertambah sesuai jumlah yang diinput
    public void deposit(double jumlah) {
        this.saldo += jumlah;
    }

    // method withdraw dimana jika saldo mencukupi, saldo akan berkurang sesuai jumlah yang diinput
    public void withdraw(double jumlah) {
        if (jumlah <= this.saldo) {
            this.saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
