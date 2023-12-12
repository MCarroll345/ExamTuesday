package ie.atu;
import java.util.Scanner;
public class ShiftWorkerApp {
    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(System.in);
            ShiftWorker w1 = new ShiftWorker();
            System.out.println("Please enter your name: ");
            w1.setName(scanner.next());
            int letters = Integer.parseInt(w1.getName());
            /*if(letters < 6 || letters >21){
                throw new IllegalArgumentException("Name provided is not valid");
            }*/
            w1.setGender(scanner.next());
            /*if(w1.getGender() != "Man"|| w1.getGender() != "Woman" || w1.getGender() != "Non-Binary"){
                throw new IllegalArgumentException("Invalid Gender Type");
            }*/
            w1.setShift(scanner.nextInt());
            if(w1.getShift() < 1||w1.getShift() >2){
                throw new IllegalArgumentException("Invalid Shift");
            }
            w1.setAge(scanner.nextInt());
            if(w1.getAge() <18){
                throw new IllegalArgumentException("Age must be at least 18");
            }

            w1.display();
            ShiftWorker w2 = new ShiftWorker("Mark","Man",1,20);
            w2.display();
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}
