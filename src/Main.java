import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Головний клас Main, з виконавчим методом main(), в якому використовуються та тестуються методи класу Plane.
 *
 * @author Dmytro Lutsenko
 */
public class Main {
    /**
     * Виконавчий метод, який створює екземпляри літаків типу Plane, вони додаються до одного списку (ангару),
     * далі сортується список спочатку за зростанням за параметром cruisingSpeed, потім за спаданням по type.
     * Потім створюється ще один екземпляр літака, і перевіряється чи є такий у нашому списку (ангарі).
     *
     * @param args - відсутні параметри
     */
    public static void main(String[] args) {
        int c11 = 2213 % 11;

        System.out.println("Лабораторна робота №3. Виконав: Луценко Дмитро Ігорович. Група: ІО-22. Номер у списку: 13");
        System.out.println("Визначити клас за варіантом 2213 mod 11: " + c11 + " - клас літак, який складається як мінімум з 5-и полів.");
        /*
        Створюємо 4 екземпляри літаків.
         */
        Plane an225 = new Plane("АН-225", "Суперважкий транспортний", 800, 15400, "Д-18Т");
        Plane an124 = new Plane("АН-124", "Важкий транспортний", 850, 15700, "Д-18Т");
        Plane an70 = new Plane("АН-70", "Середній військово-транспортний", 700, 5100, "Д-27");
        Plane an72 = new Plane("АН-72", "Легкий транспортний", 540, 4320, "Д-36");

        /*
        Поміщаємо всі літаки у наш ангар (список).
         */
        List<Plane> planes = new ArrayList<>();
        planes.add(an225);
        planes.add(an124);
        planes.add(an70);
        planes.add(an72);

        /*
        Сортуємо список за крейсерською швидкістю за зростанням за допомогою Comparator.comparingInt().
         */
        Collections.sort(planes, Comparator.comparingInt(Plane::getCruisingSpeed));
        System.out.println("\n---Відсотровані літаки за (крейсерською швидкістю) за зростанням---");
        for (Plane plane : planes) {
            System.out.println(plane.printPlaneInfo());
        }

        /*
        Сортуємо список за типом за спаданням за допомогою Comparator.comparing().
         */
        Collections.sort(planes, Comparator.comparing(Plane::getType).reversed());
        System.out.println("\n---Відсотровані літаки за (типом) за спаданням---");
        for (Plane plane : planes) {
            System.out.println(plane.printPlaneInfo());
        }

        /*
        Ствоюємо ще один літак, який не входить до списку та спробуємо знайти
        його двійника в ангарі за допомогою streamAPI.
         */
        Plane newAn225 = new Plane("АН-225", "Суперважкий транспортний", 800, 15400, "Д-18Т");
        Plane matching = planes.stream()
                .filter(plane -> newAn225.isPlaneEquals(plane))
                .findAny()
                .orElse(null);

        if (matching != null) {
            System.out.println("\nДаний літак [" + newAn225.getModel() + "] знайдений!");
        } else {
          System.out.println("\nТакого екземпляру літака у нашому ангарі не знайдено.");
        }
    }
}
