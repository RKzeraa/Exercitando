import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type your name :");
        String name = sc.next();

        System.out.println("Type your last name : ");
        String lastName = sc.next();

        System.out.println("Type your age : ");
        int age = sc.nextInt();

        System.out.println("Type your height : ");
        double height = sc.nextDouble();

        System.out.println("Hi my name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old ");
        System.out.println("My height is " + height + "cm ");
    }
}
