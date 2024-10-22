
package pkg05210000240;

public class ContactInfo {

    private String homeAddress;
    private String telNumber;
    private String eMail;

    public ContactInfo() {
        homeAddress = null;
        eMail = null;
        telNumber = null;
    }
    
    public ContactInfo(String homeAddress, String eMail, String telNumber) {
        this.eMail = eMail;
        this.homeAddress = homeAddress;
        this.telNumber = telNumber;
    }
    public ContactInfo(ContactInfo otherContactInfo){
        this.homeAddress = otherContactInfo.homeAddress;
        this.telNumber = otherContactInfo.telNumber;
        this.eMail = otherContactInfo.eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    @Override
    public String toString() {
        return  "Home Address='" + homeAddress + '\'' +
                ",tel Number='" + telNumber + '\'' +
                ", e-Mail='" + eMail + '\'';
    }
    public boolean equals(Object otherObject){
        if(otherObject == null){
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            ContactInfo otherConcactInfo = (ContactInfo)otherObject;
            return (telNumber.equals(otherConcactInfo.telNumber) &&
                    eMail.equals(otherConcactInfo.eMail) &&
                    homeAddress.equals(otherConcactInfo.telNumber));
        }
    }

}

