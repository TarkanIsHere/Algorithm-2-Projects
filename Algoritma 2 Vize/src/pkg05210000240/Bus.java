
package pkg05210000240;

public class Bus extends Vehicle{

    private int capacity;
    private int ageOfBus;
    
    public Bus(){
        super();
        capacity = 0;
        ageOfBus = 0;
    }
    public Bus(int capacity, int ageOfBus, String brand, Person owner, String licencePlate){
        super(brand, licencePlate, owner);
        this.capacity = capacity;
        this.ageOfBus = ageOfBus;
    }

    public Bus(Bus otherBus){
        this.capacity = otherBus.capacity;
        this.ageOfBus = otherBus.ageOfBus;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAgeOfBus() {
        return ageOfBus;
    }

    @Override
    public int calculateTax(){
        if(ageOfBus < 5){
            return 4000;
        } else if (ageOfBus <=10 ) {
            return 3000;
        }
        else{
            return 2000;
        }
    }

    @Override
    public String toString() {

        return super.toString() + " " +
                "capacity=" + capacity + ", ageOfBus=" + ageOfBus ;
    }


    public boolean equals(Object otherObject){
        if(otherObject == null){
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            Bus otherBus = (Bus)otherObject;
            return (capacity == otherBus.capacity &&
                    ageOfBus == otherBus.ageOfBus);
        }
    }

}
