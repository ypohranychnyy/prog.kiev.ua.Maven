/**
 * Created by sisense on 10/5/15.
 */
public class Main {
    public static void main(String[] args) {


        Car bmw = new Car(2013, "BMW", "black", "M5");
        Car tesla = new Car(2015, "Tesla", "white", "Model X");

        bmw.start();
        bmw.stop();
    }
}
