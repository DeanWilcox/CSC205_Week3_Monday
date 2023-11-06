
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

    public void PrintNames() {
        System.out.println(FirstName + " " + LastName);
    }

    public String toString() {
        return "First Name: " + FirstName + " Last Name: " + LastName;
    }

    public void changeNameAndMajor(String LastName, Major Major){
        this.LastName = LastName;
        this.Major = Major;
    }

      public void changeNameAndMajor(String FirstName, String LastName, Major Major){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Major = Major;
    }

}