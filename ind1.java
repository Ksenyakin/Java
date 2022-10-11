import java.security.KeyStore.LoadStoreParameter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Truck truck = new Truck("Kamaz", 680, 20);
        double num = in.nextInt();
        truck.print();
        truck.changeLoad_capacity(25);
        truck.print();
        truck.can(load_capacity,  num);
    }
}

public class Car {
    private String name;
    private int power;
    private int engine_capacity;

    Car(String name, int power, int engine_capacity) {
        this.name = name;
        this.power = power;
        this.engine_capacity = engine_capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEngine_capacityen() {
        return engine_capacity;
    }

    public void setEngine_capacityengine_capacity(int engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public void print() {
        System.out.println(
                "Car{" +
                        "name='" + name + '\'' +
                        ", power=" + power + ", engine capacity = " + engine_capacity +
                        '}');
    }
}

public class Truck extends Car {
    private double Load_capacity;

    Truck(String name, int power, int engine_capacity ,double load_capacity) {
        super(name, power, engine_capacity);
        this.load_capacity = load_capacity;
    }

    void changeLoad_capacity(double newLoad_capacity) {
        load_capacity = newLoad_capacity;
    }
    boolean can(double load_capacity, double num){
        if(load_capacit<num) return true;
        else return false;
    }

    public void print() {
        System.out.println("Truck{" +
                "name='" + this.getName() + '\'' +
                ", power=" + this.getPower() + ", engine_capacity = " + this.getEngine_capacity +
                "load capacity=" + load_capacity +
                '}');
    }

}
