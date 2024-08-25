import java.util.Scanner;

public class ConsoleUI {

    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);


    public void run() {
        while (true) {

            System.out.println("Меню:");
            System.out.println("1 - Вывести все ноутбуки;");
            System.out.println("2 - Вывести ноутбуки по фильтру;");
            System.out.println("3 - Добавить ноутбук;");
            System.out.println("e - Завершить программу.");
            String enteredLine = scanner.nextLine();

            switch (enteredLine) {
                case "1": service.printAllLaptops();
                    break;
                case "2": service.configuringFilter();
                    service.printLaptopsByFilter();
                    break;
                case "3": service.addLaptop();
                    break;
                case "e": System.exit(0);

            }
        }
    }

}
