/**
 * Main
 */

 public class Main {
    public static void main(String[] args) {
        SeasonsLogic();

        Student student1 = new Student();
        student1.FirstName = "Eric";
        student1.LastName = "Cartman";
        student1.GPA = 3.0f;
        student1.Major = Major.IT;

        System.out.println(student1.FirstName);
    
    }

    public static void SeasonsLogic(){
        Seasons seasons = Seasons.SPRING; // Spring, Summer, Fall/Autumn, Winter
        
        if(seasons == Seasons.SPRING){
            System.out.println("This is my favorite season!");
        }
        else if(seasons == Seasons.WINTER){
            System.out.println("This is my second favorite season!");
        } else {
            System.out.println("Fall and summer are both okay.");
        }
    }        
}
