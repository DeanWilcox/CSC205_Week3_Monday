/**
 * Main
 */

 public class Main {
    public static void main(String[] args) {
        SeasonsLogic();

        //student1 information
        Student student1 = new Student();
        student1.setFirstName("Dean");
        student1.setLastName("Wilcox");
        student1.Major = Major.IT;

        //student2 information
        Student student2 = new Student();
        student2.setFirstName("James");
        student2.setLastName("Franco");
        student2.Major = Major.EDUCATION;


        //car1 information
        Car car1 = new Car();
        car1.Mileage = 50000.5;
        car1.BodyStyle = BodyStyle.SEDAN;
        car1.CarMake = Make.FORD;

        //car2 information
        Car car2 = new Car();
        car2.Mileage = 50001.9;
        car2.BodyStyle = BodyStyle.VAN;
        car2.CarMake = Make.MAZDA;

        //car3 information
        Car car3 = new Car();
        car3.Mileage = 50002.3;
        car3.BodyStyle = BodyStyle.COUPE;
        car3.CarMake = Make.GMC;

        //print student1 info to console
        System.out.println(student1.getFirstName() + " " + student1.getLastName());
        //print student1 info to console
        System.out.println(student2.getFirstName() + " " + student2.getLastName());

        //print car 1 info to console
        System.out.println(car1.Mileage);
        System.out.println(car1.BodyStyle);
        System.out.println(car1.CarMake);
        //print car 2 info to console
        System.out.println(car2.Mileage);
        System.out.println(car2.BodyStyle);
        System.out.println(car2.CarMake);
        //print car 3 info to console
        System.out.println(car3.Mileage);
        System.out.println(car3.BodyStyle);
        System.out.println(car3.CarMake);
    
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
