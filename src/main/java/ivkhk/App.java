package ivkhk;
import java.util.Scanner;
public class App {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        do{
            System.out.println("Список задач");
            System.out.println("0. Выйти из программы");
            System.out.println("Введите номер задачи:");
            int task = scanner.nextInt();
            switch (task) {

                case 0:
                    System.out.println("Выход из программы");
                    System.exit(0);
                default:
                System.out.println("Выберите номер из списка задач!");
            }
        }while (true);
    }
}
