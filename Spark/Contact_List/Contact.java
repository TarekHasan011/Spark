// 
// Decompiled by Procyon v0.5.36
// 

package Contact_List;

public class Contact
{
    public String name;
    public String email;
    public String phoneNumber;
    public String occupation;
    public String university;
    public String address;
    
    public Contact(final String name, final String email, final String phoneNumber, final String occupation, final String university, final String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.university = university;
        this.address = address;
    }
    
    public Contact(final String information) {
        final String[] strings = information.split("&");
        this.name = strings[0];
        this.email = strings[1];
        this.phoneNumber = strings[2];
        this.occupation = strings[3];
        this.university = strings[4];
        this.address = strings[5];
    }
    
    public String information() {
        return String.valueOf(this.name) + "&" + this.email + "&" + this.phoneNumber + "&" + this.occupation + "&" + this.university + "&" + this.address + "\r\n";
    }
}
