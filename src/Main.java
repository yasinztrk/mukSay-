import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        System.out.print("Bir Sayı Giriniz :");
        number = input.nextInt();


        for (int i = 1; i < number; i++) {


            if (number % i == 0) {
                total += i;
            }
        }
                if (total == number) {
                    System.out.println(number + " Mükemmel Sayıdır.");

                } else if (total != number) {
                    System.out.println(number + " Mükemmel Sayı Değildir.");
                }



            }
        }




