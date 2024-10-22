
package pkg05210000240;
public class Person {
    
    private String name;
    private ContactInfo contactInformation;

    public Person(){
        name = null;
        contactInformation = null;
    }

    public Person(ContactInfo contactInformation, String name){
        this.contactInformation = new ContactInfo(contactInformation);
        this.name = name;
    }
    public Person(Person otherPerson){
        this.name = otherPerson.name;
        this.contactInformation = new ContactInfo(otherPerson.getContactInformation());
    }

    public ContactInfo getContactInformation() {
        return new ContactInfo(contactInformation);
    }

    public void setContactInformation(ContactInfo contactInformation) {
        this.contactInformation = new ContactInfo(contactInformation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                "," + contactInformation ;
    }

    public boolean equals(Object otherObject){
        if(otherObject == null){
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            Person otherPerson = (Person)otherObject;
            return (name.equals(otherPerson.name) &&
                    contactInformation.equals(otherPerson.contactInformation));
        }
    }
}

