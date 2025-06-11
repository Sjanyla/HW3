import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String MyName;
        final int NUM = 85;
        String word = "Working File";
        MyName = NUM + word;
        System.out.println(NUM + MyName);

        if (NUM < 0) {
            System.out.println("negativeNamber");
        } else if (NUM > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("the number is zero");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name:");
        String nameS=scanner.nextLine();
        System.out.println("Hi,"+ nameS);
    }
}