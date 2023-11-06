/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        SeasonsLogic();
        CarLogic();
        StudentLogic();
    }

    public static void SeasonsLogic(){
        Seasons seasons = Seasons.SPRING;

        if(seasons == Seasons.SPRING){
            System.out.println("This is my favorite season!");
        }
        else if(seasons == Seasons.WINTER){
            System.out.println("This is my second favorite season!");
        } else {
            System.out.println("Fall and Summer are both okay");
        }
    }

    public static void CarLogic(){
        Car car1 = new Car();
        car1.Mileage = 50000;
        car1.BodyStyle = BodyStyle.SEDAN;
        car1.CarMake = Make.FORD;
        Car car2 = new Car();
        car2.Mileage = 12000;
        car2.BodyStyle = BodyStyle.SUV;
        car2.CarMake = Make.MAZDA;
        Car car3 = new Car();
        car3.Mileage = 87777;
        car3.BodyStyle = BodyStyle.TRUCK;
        car3.CarMake = Make.TOYOTA;
    }

    public static void StudentLogic(){
        Student student1 = new Student();
        student1.setFirstName("Eric");
        student1.setLastName("Student");
        student1.Major = Major.ART;
        Student student2 = new Student();

        System.out.println(student1.getFirstName() + " " + student1.getLastName());
        System.out.println(student2);
    }
}
