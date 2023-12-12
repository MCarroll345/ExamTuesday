package ie.atu;

public class ShiftWorker {
    String name,gender;
    int age,shift;

    public ShiftWorker(){
    }

    public ShiftWorker(String sname,String sgender,int sage, int sshift) {
        this.name = sname;
        this.gender = sgender;
        this.age = sage;
        this.shift = sshift;
    }
    
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public int getShift() {
        return shift;
    }
    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setShift(int shift) {
        this.shift = shift;
    }
    
    public void display(){
        if(getShift() == 1){
            System.out.println("\n\nName: "+ getName() +"\nGender: "+ getGender() + "\nShift: Day Shift  \nAge: " + getAge());
        }
        else if(getShift() == 2){
            System.out.println("\n\nName: "+ getName() +"\nGender: "+ getGender() + "\nShift: Night Shift\nAge: " + getAge());
        }
    }
    
}
