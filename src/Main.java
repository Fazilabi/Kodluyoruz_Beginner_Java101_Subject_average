import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chemical, music;
        double result;
        System.out.print("Enter math point : ");
        math = input.nextInt();
        System.out.print("Enter math point : ");
        physics = input.nextInt();
        System.out.print("Enter physics point : ");
        turkish = input.nextInt();
        System.out.print("Enter turkish point : ");
        chemical = input.nextInt();
        System.out.print("Enter music point : ");
        music = input.nextInt();
        result = (math + physics + turkish + chemical + music) / 5;
        if (math < 0 && math > 100 || physics < 0 && physics > 100 || turkish < 0 & turkish > 100 || chemical < 0 && chemical > 100 || music < 0 && music > 100) {
            System.out.println("point you entered is not correct. Please enter number 1-100");
        } else {
            if (result < 50) {
                System.out.println("failed!");
            } else if (result > 49.99 && result < 69) {
                System.out.println("Good... Your result is -- " + result + "--C");
            } else if (result > 70 && result < 90) {
                System.out.println("Fine... Your result is -- " + result + "--B");
            } else {
                System.out.println("Perfect! Your result is -- " + result + "--A");

            }
        }


    }
}