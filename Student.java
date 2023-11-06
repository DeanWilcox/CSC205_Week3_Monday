
public class Student {

    private String FirstName, LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String newName){
        FirstName = newName.toLowerCase();
    }
     
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String newName){
        LastName = newName.toUpperCase();
    }

    //first Major is the type (enum)
    //second Major is the property name
    Major Major;


}