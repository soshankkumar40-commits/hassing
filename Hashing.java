import java.util.HashSet;

public class Hashing {

    public static void main(String[] args){
        HashSet<String> car = new HashSet<String>();

        car.add("volvo");
        car.add("volvo");
        car.add("marsdis");
        car.add("BMW");
        car.add("Ford");
        car.add("Range Rober");
        car.add("Mazda");

            //   System.out.println("HashShet Element");
            //   System.out.println(car);;
            // Adding duplicate element

            // Display elements

            System.out.println("All car: "+ car);
// Adding duplicate element

            car.add("BMW");

            System.out.println("After Duplicate:"+ car);
            // Searching element
            System.out.println("BMW Avalable:"+ car.contains("BMW"));
            // Removing Element
            car.remove("Ford");
            System.out.println("After Removing Ford: + car");

            // Size of Hashset
            System.out.println("Is Audi Available:" + car.contains("Audi"));

            // Display using For-each loop
            System.out.println("Final Car List:");

            for(String c : car){
                System.out.println(c);
            }
        }
    
            }







