import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);
        int right = 4;
        int islemler, price;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz: ");
            username = input.nextLine();
            System.out.print("Şifre giriniz: ");
            password = input.nextLine();

            switch (username) {
                case "patika":
                    switch (password) {
                        case "dev123":
                            System.out.println();

                            System.out.println("Sisteme giriş yaptınız\n" +
                                    "Yapacağınız işlem numarasını giriniz:\n" +
                                    "1-Para yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap\n");
                            islemler = input.nextInt();

                            switch (islemler) {
                                case 1:
                                    System.out.print("Yatırmak istediğiniz para miktarını girin: ");
                                    price = input.nextInt();
                                    balance += price;
                                    right = -1;
                                    break;
                                case 2:
                                    System.out.print("Çekmek istediğiniz para miktarını girin: ");
                                    price = input.nextInt();
                                    String mesaj = balance > price ? "Para çekme işlemi başarılı: "
                                            + Integer.toString(balance -= price) : "Yetersiz bakiye";
                                    System.out.print(mesaj);
                                    right = -1;
                                    break;
                                case 3:
                                    System.out.print("Bakiyeniz : " + balance);
                                    right = -1;
                                    break;
                                case 4:
                                    System.out.println("Tekrar görüşmek üzere.");
                                    right = -1;
                                    break;
                            }
                            break;
                        default:
                            --right;
                            System.out.println("Kullanıcı adı veya şifre hatalı tekrar deneyiniz");
                            System.out.println(right + " Hakkınız kaldı");
                    }
                    break;
                default:
                    --right;
                    System.out.println("Kullanıcı adı veya şifre hatalı tekrar deneyiniz");
                    System.out.println(right + " Hakkınız kaldı");
            }

        }
        switch (right) {
            case 0:
                System.out.println("Hesabınız bloke olmuştur.");
                break;
        }
    }
}
