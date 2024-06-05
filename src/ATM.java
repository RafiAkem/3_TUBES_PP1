public class ATM {
    private Account head;

    public boolean isEmpty() {
        return head == null;
    }

    // method addAccount untuk menambahkan akun baru ke dalam linked list
    public void addAccount(String name, double saldo) {
        Account newAccount = new Account(name, saldo);
        newAccount.setNext(head);
        head = newAccount;
    }

    //method removeAccount untuk menghapus akun dari linked list
    public void removeAccount(String name) {
        if (isEmpty()) {
            System.out.println("Tidak ada akun yang terdaftar");
        } else {
            Account current = head;
            Account prev = null;
            while (current != null) {
                if (current.getName().equals(name)) {
                    if (prev == null) {
                        head = current.getNext();
                    } else {
                        prev.setNext(current.getNext());
                    }
                    return;
                }
                prev = current;
                current = current.getNext();
            }
            System.out.println("Akun dengan nama " + name + " tidak ditemukan");
        }
    }

    // Implementasi method withdrawFromAccount dan depositToAccount
    public void withdrawFromAccount(String name, double jumlah) {
        // current, variabel sementara untuk menelusuri linked list dari Account
        Account current = head;
        // Mencari akun dengan nama yang sesuai
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
        // current, variabel sementara untuk menelusuri linked list dari Account
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
            System.out.println("| No.\t| Nama\t\t| Saldo         |");
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