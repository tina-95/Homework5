import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cat[] cats = {
                new Cat(15),
                new Cat(30)};
        Bowl bowl1 = new Bowl(40);

        for (int i = 0; i < cats.length; i++) {
            System.out.print("Cat " + (i + 1) + ": ");
            if (!cats[i].eat(bowl1)) {
                bowl1.info();
                System.out.println("Положите еду в миску.");
                int x = scan.nextInt();
                bowl1.fillFood(x);
                i--;

            } else {
                System.out.println("наелся");
            }

        }
    }
}













