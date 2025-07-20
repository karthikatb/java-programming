package helloworld;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.color = "Red";
        mycar.model = "Tesla";
        mycar.drive();
        mycar.stop();
        System.out.println("color:"+mycar.color);
        System.out.println("model:"+mycar.model);
    }
}