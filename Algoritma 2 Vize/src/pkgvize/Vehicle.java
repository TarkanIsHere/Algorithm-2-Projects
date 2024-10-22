
package pkg05210000240;


 abstract public class Vehicle {
     
    private String brand;
    private String licencePlate;
    private Person owner;

    public Vehicle(){
        brand = null;
        licencePlate = null;
        owner = null;
    }
    public Vehicle(Vehicle otherVehicle){
        this.brand = otherVehicle.brand;
        this.licencePlate = otherVehicle.licencePlate;
        this.owner = new Person(otherVehicle.owner);
    }
    
    public Vehicle(String brand, String licencePlate, Person owner){
        this.brand = brand;
        this.licencePlate = licencePlate;
        this.owner = new Person(owner);
    }

    public String getBrand() {
        return brand;
    }

    public Person getOwner() {
        return new Person(owner);
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setOwner(Person owner) {
        this.owner = new Person(owner);
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                "," + owner ;
    }

    public boolean equals(Object otherObject){
        if(otherObject == null){
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            Vehicle otherVehicle = (Vehicle)otherObject;
            return (brand.equals(otherVehicle.brand) &&
                    licencePlate.equals(otherVehicle.licencePlate) &&
                    owner.equals(otherVehicle.owner));
        }
    }

    abstract public int calculateTax();
}
