package Cars;

public class Main {
    public static void main(String[] cars){
        Cars car = new Cars();
        car.model = "Rocket";
        car.wheels = 14;
        car.speed = 1115;
        car.isBig = true;


        //car.printInfo();

        Cars Tesla = new Cars();
        Tesla.printInfo();
        Tesla.checkSpeed();

        Cars BMW = new Cars("BMW", 6, 55, true);
        BMW.printInfo();
        BMW.checkSpeed();

        Cars Honda = new Cars(car);
        Honda.printInfo();
        Honda.checkSpeed();



        System.out.println(Cars.count);


    }


}
