/**
 * Клас Plane, що складається з 5 полів, які його описують, для кожного з яких є свій геттер.
 * Наявний метод для перевірки рівності об'єктів (літаків) цього класу, та метод для зручного виведення інформації
 * про літак (об'єкт), тобто його характеристики (поля).
 *
 * @author Dmytro Lutsenko
 */
public class Plane {
    /*
    П'ять полів класу Plane, які визначають модель літака, його тип, крейсерськую швидкість, практичну дальність та
    тип встановленого двигуна.
     */
    private String model;
    private String type;
    private int cruisingSpeed;
    private int practicalRange;
    private String engine;

    /**
     * Конструктор класу Plane для опису літака.
     *
     * @param model - модель літака
     * @param type - тип літака
     * @param cruisingSpeed - крейсерська швидкість літака
     * @param practicalRange - практична дальність літака
     * @param engine - тип двигуна, вбудованого у літак
     */
    public Plane(String model, String type, int cruisingSpeed, int practicalRange, String engine) {
        this.model = model;
        this.type = type;
        this.cruisingSpeed = cruisingSpeed;
        this.practicalRange = practicalRange;
        this.engine = engine;
    }

    /**
     * Геттер для повернення моделі літака.
     *
     * @return модель літака
     */
    public String getModel() {
        return model;
    }

    /**
     * Геттер для повернення типу літака.
     *
     * @return тип літака
     */
    public String getType() {
        return type;
    }

    /**
     * Геттер для повернення крейсерської швидкості літака.
     *
     * @return крейсерська швидкість літака
     */
    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    /**
     * Геттер для повернення практичної дальності літака.
     *
     * @return модель літака
     */
    public int getPracticalRange() {
        return practicalRange;
    }

    /**
     * Геттер для повернення моделі двигуна, вбудованого у літак.
     *
     * @return тип двигуна літака
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Метод, який порівнює заданий об'єкт класу (він може бути будь-якого типу) з іншим об'єктом класу типу Plane.
     * Спочатку порівнюються посилання на адресу пам'яті, потім приналежність обох об'єктів до класу Plane.
     * І далі вже порівнюються усі поля двох об'єктів.
     *
     * @param obj - об'єкт класу (літак), який буде порівняний з іншим об'єктом (літаком)
     * @return true - якщо вони посилаються на одну й ту саму адресу в пам'яті, або всі поля обох об'єктів рівні,
     * false - якщо obj або заданий пустим, або не є типом Plane
     */
    public boolean isPlaneEquals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Plane plane = (Plane) obj;
        return model.equals(plane.model) &&
                type.equals(plane.type) &&
                cruisingSpeed == plane.cruisingSpeed &&
                practicalRange == plane.practicalRange &&
                engine.equals(plane.engine);
    }

    /**
     * Метод для зручного виведення інформації про літак (тобто його характеристики).
     *
     * @return всі характеристики літака (модель, тип, крейсерська швидкість,
     * практична дальність, тип двигуна) в одну строку
     */
    public String printPlaneInfo(){
        return "Модель: [" + model +
                "], тип: [" + type +
                "], крейсерська швидкість: [" + cruisingSpeed +
                "], практична дальність: [" + practicalRange +
                "], тип двигуна: [" + engine + "].";
    }
}