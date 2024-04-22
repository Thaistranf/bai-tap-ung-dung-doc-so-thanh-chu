import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int num = sc.nextInt();
        int ones = num % 10;        //Hàng đơn vị
        int tens = num / 10;        //Hàng chục
        int hundred;                //Hàng trăm


        if (num >= 0 && num < 10) {
            switch (num){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (num >=10 && num < 20) {
            switch (ones){
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (num >= 20 && num < 100) {
            switch (tens){
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (ones){
                case 1:
                    System.out.println("-one");
                    break;
                case 2:
                    System.out.println("-two");
                    break;
                case 3:
                    System.out.println("-three");
                    break;
                case 4:
                    System.out.println("-four");
                    break;
                case 5:
                    System.out.println("-five");
                    break;
                case 6:
                    System.out.println("-six");
                    break;
                case 7:
                    System.out.println("-seven");
                    break;
                case 8:
                    System.out.println("-eight");
                    break;
                case 9:
                    System.out.println("-nine");
                    break;
            }
        } else if (num >= 100 && num < 1000) {
            switch (tens){
                case 10:
                    System.out.print("One hundred ");
                    break;
                case 20:
                    System.out.print("Two hundred ");
                    break;
                case 30:
                    System.out.print("Three hundred ");
                    break;
                case 40:
                    System.out.print("Four hundred ");
                    break;
                case 50:
                    System.out.print("Five hundred ");
                    break;
                case 60:
                    System.out.print("Six hundred ");
                    break;
                case 70:
                    System.out.print("Seven hundred ");
                    break;
                case 80:
                    System.out.print("Eight hundred ");
                    break;
                case 90:
                    System.out.print("Nine hundred ");
                    break;
            }
//            switch (tens){
//                case 0:
//                    System.out.print("and ten ");
//                    break;
//                case 2:
//                    System.out.print("and twenty ");
//                    break;
//                case 3:
//                    System.out.print("and thirty ");
//                    break;
//                case 4:
//                    System.out.print("and forty ");
//                    break;
//                case 5:
//                    System.out.print("and fifty ");
//                    break;
//                case 6:
//                    System.out.print("and sixty ");
//                    break;
//                case 7:
//                    System.out.print("and seventy ");
//                    break;
//                case 8:
//                    System.out.print("and eighty ");
//                    break;
//                case 9:
//                    System.out.print("and ninety ");
//                    break;
//                default:
//                    System.out.print("and ");
//            }
            switch (ones){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else {
            System.out.println("out of ability");
        }

    }
}