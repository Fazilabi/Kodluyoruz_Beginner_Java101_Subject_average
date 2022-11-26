import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int math , physics , turkish, chemical, music;
        double result;
        System.out.print("Enter math point : ");

        math = input.nextInt();
        if (math > 0 && math <= 100) {
            System.out.println("math point is : " + math);
        }else {
            System.out.println("point will be 1-100 range...Your point accepted : 0 point");
            math = 0;
        }


        System.out.print("Enter physics point : ");
        physics = input.nextInt();
        if (physics > 0 && physics <= 100) {
            System.out.println("physics point is : " + physics);
        }else {
            System.out.println("point will be 1-100 range...Your point accepted : 0 point");
            physics = 0;
        }


        System.out.print("Enter turkish point : ");
        turkish = input.nextInt();

        if (turkish > 0 && turkish <= 100) {
            System.out.println("turkish point is : " + turkish);
        }else {
            System.out.println("point will be 1-100 range...Your point accepted : 0 point");
            turkish = 0;
        }



        System.out.print("Enter chemical point : ");
        chemical = input.nextInt();

        if (chemical > 0 && chemical <= 100) {
            System.out.println("chemical point is : " + chemical);
        }else {
            System.out.println("point will be 1-100 range...Your point accepted : 0 point");
            chemical = 0;
        }



        System.out.print("Enter music point : ");
        music = input.nextInt();
        if (music > 0 && music <= 100) {
            System.out.println("music point is : " + music);
        }else {
            System.out.println("point will be 1-100 range...Your point accepted : 0 point");
            music = 0;
        }
        result = (math + physics + turkish + chemical + music) / 5d;

        if (result < 49.99) {
            System.out.println("failed! Your result is : " + result);
        } else if (result > 49.99 && result < 69) {
            System.out.println("Good... Your result is -- " + result + "--C");
        } else if (result > 69 && result < 90) {
            System.out.println("Fine... Your result is -- " + result + "--B");
        } else {
            System.out.println("Perfect! Your result is -- " + result + "--A");

        }










    }
}