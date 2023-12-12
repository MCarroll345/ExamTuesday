package ie.atu;
import java.util.Scanner;
public class ShiftWorkerApp {
    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(System.in);
            ShiftWorker w1 = new ShiftWorker();
            System.out.println("\nPlease enter your name: ");
            w1.setName(scanner.nextLine());

            System.out.println("\nPlease enter your gender: ");
            w1.setGender(scanner.nextLine());
            /*if(w1.getGender() != "Man"|| w1.getGender() != "Woman" || w1.getGender() != "Non-Binary"){
                throw new IllegalArgumentException("Invalid Gender Type");
            }*/
            System.out.println("\nPlease enter your shift(Day = 1, Night = 2): ");
            w1.setShift(scanner.nextInt());
            if(w1.getShift() < 1||w1.getShift() >2){
                throw new IllegalArgumentException("Invalid Shift");
            }
            System.out.println("\nPlease enter your age: ");
            w1.setAge(scanner.nextInt());
            if(w1.getAge() <18){
                throw new IllegalArgumentException("Age must be at least 18");
            }

            ShiftWorker w2 = new ShiftWorker("Mark","Man",1,20);
            ShiftWorker w3 = new ShiftWorker("Test Woman","Woman",2,30);
            w1.display();
            w2.display();
            w3.display();
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}
