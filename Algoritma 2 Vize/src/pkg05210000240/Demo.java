
package pkg05210000240;


public class Demo {
    public static void main(String[] args){
        ContactInfo objOfContact = new ContactInfo("Ankara", "tarkanyildiz600@gmail.com", "05455993448" );
        Person objOfPerson = new Person(objOfContact, "Tarkan");
        Bus objOfBus = new Bus(100, 3, "Mercedes", objOfPerson, "06TKO89");
        System.out.println(objOfBus.toString());
        System.out.println("Odeyecegi vergi miktari " + objOfBus.calculateTax() + "TL");
        Bus objOfBus2 = new Bus(objOfBus);
        System.out.println("Otobus objeleri esit mi: " +objOfBus.equals(objOfBus2));
        
    }





}

