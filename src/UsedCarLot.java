import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }
    public ArrayList<Car> getInventory(){
        return inventory;
    }
    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int int1, int int2){
        if(int1< inventory.size() && int2 < inventory.size())
        {
            Car car1 = inventory.get(int1);
            Car car2 = inventory.set(int2, car1);
            inventory.set(int1, car2);
            return true;
        }
        else{return false;}
    }

}
