package Cars;

public class Cars {
    String model;
    int wheels;
    int speed;
    boolean isBig;

    static  int count = 2;

    Cars (){
        model = "Tesla";
        wheels = 4;
        speed = 75;
        isBig = false;
    }

    Cars(String model, int wheels, int speed, boolean isBig){
        this.model = model;
        this.wheels = wheels;
        this.speed = speed;
        this.isBig = isBig;
    }
    Cars(Cars Honda){
        this.model = Honda.model;
        this.wheels = Honda.wheels;
        this.speed = Honda.speed;
        this.isBig = Honda.isBig;
    }

    void printInfo() {
        String info = ("марка -"+model+"- колёс:" + wheels + " скорость - "+ speed);
        String size = isBig? "big" : "small";
        System.out.println(info.concat(" размер: "+size));

    }
    void checkSpeed(){
        if (speed > 100){
            System.out.println("fast");
        } else {
            System.out.println("not fast enough");
        }
    }

}
