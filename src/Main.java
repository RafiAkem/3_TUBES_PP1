import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("| 1. Tambah Akun                  |");
            System.out.println("| 2. Tarik Saldo                  |");
            System.out.println("| 3. Deposit Saldo                |");
            System.out.println("| 4. Cek Saldo                    |");
            System.out.println("| 5. Hapus Akun                   |");
            System.out.println("| 6. Keluar                       |");
            System.out.println("===================================");
            System.out.print("Pilih opsi: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String name = scanner.next();
                    System.out.print("Masukkan saldo awal: Rp. ");
                    double saldo = scanner.nextDouble();
                    atm.addAccount(name, saldo);
                    break;
                case 2:
                    System.out.print("Masukkan nama akun: ");
                    String nameWithdraw = scanner.next();
                    System.out.print("Masukkan jumlah penarikan: ");
                    double jumlahTarik = scanner.nextDouble();
                    atm.withdrawFromAccount(nameWithdraw, jumlahTarik);
                    break;

                case 3:
                    System.out.print("Masukkan nama akun: ");
                    String nameDeposit = scanner.next();
                    System.out.print("Masukkan jumlah deposit: ");
                    double jumlahDeposit = scanner.nextDouble();
                    atm.depositToAccount(nameDeposit, jumlahDeposit);
                    break;
                case 4:
                    atm.checkSaldo();
                    break;
                case 5:
                    System.out.print("Masukkan nama akun yang ingin dihapus: ");
                    String nameDelete = scanner.next();
                    atm.removeAccount(nameDelete);
                    scanner.close();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}
