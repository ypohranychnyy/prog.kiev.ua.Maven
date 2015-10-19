/**
 * Created by sisense on 10/5/15.
 */
public class Car {
    private int make;
    private String brand;
    private String color;
    private String name;

public Car (int make, String brand, String color, String name){
    this.make = make;
    this.brand = brand;
    this.color = color;
    this.name = name;

}
    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void start(){
    System.out.println(this.getBrand()+" go-go-go");
}
    public void stop(){
        System.out.println(this.getBrand()+" Prrrrrr...");
    }
}
