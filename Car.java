public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return (getClass().getSimpleName() + " -> starEngine");
    }

    public String accelerate() {
         return (getClass().getSimpleName() + " -> accelerate");
    }

    public String brake() {
        return (getClass().getSimpleName() + " -> brake");
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}
