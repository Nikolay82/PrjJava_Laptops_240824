import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class LaptopService {

    private Set<Laptop> laptops = new HashSet<>();
    private Laptop filter = null;

    public LaptopService() {
        fillLaptopsByExamples();
    }

    private void fillLaptopsByExamples() {
        Laptop laptop = new Laptop();
        laptop.setSerialNum("1");
        laptop.setBrend("Samsung");
        laptop.setModel("M1");
        laptop.setColour("Black");
        laptop.setDiagonal("19");
        laptop.setOperSystem("Windows 10");
        laptop.setRam("8");
        laptop.setMemoryHdd("500");
        //System.out.println(laptop);
        laptops.add(laptop);

        laptop = new Laptop();
        laptop.setSerialNum("5");
        laptop.setBrend("Samsung");
        laptop.setModel("M5");
        laptop.setColour("Black");
        laptop.setDiagonal("19");
        laptop.setOperSystem("Windows 7");
        laptop.setRam("6");
        laptop.setMemoryHdd("1000");
        //System.out.println(laptop);
        laptops.add(laptop);

        laptop = new Laptop();
        laptop.setSerialNum("9");
        laptop.setBrend("HP");
        laptop.setModel("M8");
        laptop.setColour("Red");
        laptop.setDiagonal("15");
        laptop.setOperSystem("Windows 10");
        laptop.setRam("8");
        laptop.setMemoryHdd("500");
        //System.out.println(laptop);

        laptops.add(laptop);
        laptop = new Laptop();
        laptop.setSerialNum("9");
        laptop.setBrend("Acer");
        laptop.setModel("L23");
        laptop.setColour("Green");
        laptop.setDiagonal("15");
        laptop.setOperSystem("Linux");
        laptop.setRam("8");
        laptop.setMemoryHdd("1000");
        //System.out.println(laptop);
        laptops.add(laptop);
    }

    public void printAllLaptops() {
        System.out.println("Ноутбуки:");
        int index = 1;
        /*
        laptops.forEach(laptop -> {
            System.out.println(laptop);
        });
        */
        for (Laptop laptop: laptops) {
            System.out.println(index++ + ")" + laptop);
        }
        System.out.println();
    }

    public void configuringFilter() {
        Scanner scanner = new Scanner(System.in);
        String enteredLine = "";
        filter = new Laptop();
        System.out.println("Конфигурация фильтра:");

        System.out.print("Введите серийный номер(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setSerialNum(enteredLine);

        System.out.print("Введите наименование бренда(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setBrend(enteredLine);

        System.out.print("Введите наименование модели(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setModel(enteredLine);

        System.out.print("Введите цвет(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setColour(enteredLine);

        System.out.print("Введите диагональ(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setDiagonal(enteredLine);

        System.out.print("Введите наименование ОС(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setOperSystem(enteredLine);

        System.out.print("Введите размер ОЗУ в ГБ(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setRam(enteredLine);

        System.out.print("Введите размер HDD в ГБ(оставьте пустым, если не нужно фильтровать по этому параметру)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) filter.setMemoryHdd(enteredLine);

        System.out.println();
    }

    public void printLaptopsByFilter() {
        System.out.println("Ноутбуки по фильтру(" + filter.toStringWithoutNull() +"):");
        int index = 1;
        for (Laptop laptop: laptops) {
            if (laptop.equals(filter)) System.out.println(index++ + ")" + laptop);
        }
        System.out.println();
    }

    public void addLaptop() {
        Scanner scanner = new Scanner(System.in);
        String enteredLine = "";
        Laptop laptop = new Laptop();
        System.out.println("Добавление ноутбука:");

        System.out.print("Введите серийный номер=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setSerialNum(enteredLine);
            else laptop.setSerialNum("");
        System.out.print("Введите наименование бренда=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setBrend(enteredLine);
            else laptop.setBrend("");
        System.out.print("Введите наименование модели=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setModel(enteredLine);
            else laptop.setModel("");
        System.out.print("Введите цвет=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setColour(enteredLine);
            else laptop.setColour("");
        System.out.print("Введите диагональ=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setDiagonal(enteredLine);
            else laptop.setDiagonal("");
        System.out.print("Введите наименование ОС=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setOperSystem(enteredLine);
            else laptop.setOperSystem("");
        System.out.print("Введите ОЗУ(ГБ)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setRam(enteredLine);
            else laptop.setRam("");
        System.out.print("Введите память HDD(ГБ)=");
        enteredLine = scanner.nextLine();
        if (enteredLine.length() > 0) laptop.setMemoryHdd(enteredLine);
            else laptop.setMemoryHdd("");
        System.out.println();
        System.out.println("Добавлен ноутбук:");
        System.out.println(laptop);
        System.out.println();
        laptops.add(laptop);
    }
}
