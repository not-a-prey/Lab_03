/*
Клас Plane, що складається з 5 полів, які його описують, для кожного з яких є свій геттер.
Наявний метод для перевірки рівності об'єктів цього класу, та метод для зручного виведення інформації
про літак (об'єкт), тобто його характеристики (поля).
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

    /*
    Конструктор класу Plane.
     */
    public Plane(String model, String type, int cruisingSpeed, int practicalRange, String engine) {
        this.model = model;
        this.type = type;
        this.cruisingSpeed = cruisingSpeed;
        this.practicalRange = practicalRange;
        this.engine = engine;
    }

    //Геттери для усіх полів класу.
    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public int getPracticalRange() {
        return practicalRange;
    }

    public String getEngine() {
        return engine;
    }

    /*
    Метод для перевірки чи рівні об'єкти класу Plane за всіма полями.
     */
    public boolean isPlaneEquals(Object obj) {
        //Якщо адреса пам'яті на яку посилаються obj та об'єкт класу однакові, тоді це один і той самий об'єкт.
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

    /*
    Метод для зручного виведення характеристики про літак (тобто полів).
     */
    public String printPlaneInfo(){
        return "Модель: [" + model +
                "], тип: [" + type +
                "], крейсерська швидкість: [" + cruisingSpeed +
                "], практична дальність: [" + practicalRange +
                "], тип двигуна: [" + engine + "].";
    }
}