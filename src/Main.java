import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Поздороваюсь с вами через...");

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Привет, " + name + ", рады тебя тут видеть!");
    }
}