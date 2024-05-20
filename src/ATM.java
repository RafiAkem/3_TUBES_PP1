public class ATM {
    private Account head;

    public boolean isEmpty() {
        return head == null;
    }

    //
    public void addAccount(String name, double saldo) {
        Account newAccount = new Account(name, saldo);
        newAccount.setNext(head);
        head = newAccount;
    }

    // Implementasi method withdrawFromAccount dan depositToAccount
    public void withdrawFromAccount(String name, double jumlah) {
        Account current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                current.withdraw(jumlah);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Akun dengan nama " + name + " tidak ditemukan");
    }

    public void depositToAccount(String name, double jumlah) {
        Account current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                current.deposit(jumlah);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Akun dengan nama " + name + " tidak ditemukan");
    }

    public void checkSaldo() {
        if (isEmpty()) {
            System.out.println("Tidak ada akun yang terdaftar");
        } else {
            System.out.println("=====================================");
            System.out.println("| No.\t| Nama\t\t| Saldo\t\t\t|");
            System.out.println("-------------------------------------");
            Account current = head;
            int i = 1;
            while (current != null) {
                System.out.println("| " + i + ".\t| " + current.getName() + "\t\t| " + "Rp. " + current.getSaldo() + "\t|");
                current = current.getNext();
                i++;
            }
            System.out.println("=====================================");
        }
    }
}