package vehicles;

public class MountainBike extends Bicycle {
    int saddle;
    public MountainBike(){

    }
    public MountainBike(int price, String color, int saddle){
        this.saddle = saddle;
        super.price = price;
        super.color = color;
    }

    public String toString(){
        String str = "price:" + super.price + ", color:" + super.color
            +", saddle:" + this.saddle;
        return str;
    }
}
