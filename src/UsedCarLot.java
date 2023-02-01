import javax.lang.model.type.NullType;
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

    /* Adds a Car to the the inventory list at the index specified
     by indexToAdd; this method increases the size of inventory by 1

     PRECONDITION: indexToAdd < inventory.size()
   */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        @return returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element...
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       @return returns the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell,null);
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory list; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in inventory list

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car moved = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, moved);
    }

}
