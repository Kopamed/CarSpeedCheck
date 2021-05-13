import java.util.Scanner;

// 13/05/2021
// First ever java code less gooo!
public class Main
{
    int maxSpeed = 120;
    int speed = 60;
    int minSpeed = 3;
    String units = "km/h";
    boolean moving = false;
    
    public String inputString(String prompt) {
        Scanner inputln = new Scanner(System.in);
        
        System.out.println(prompt);
        String output = inputln.nextLine();
        return output;
    }
    
    public void fullThrust() {
        this.speed = this.maxSpeed;
    }
    
    public void logInfo() {
        System.out.println("[+] Moving: " + this.moving);
        System.out.println("[+] Car's speed: " + this.speed);
		System.out.println("[+] Car's max speed: " + this.maxSpeed);
		System.out.println("[+] Car's min's speed: " + this.minSpeed);
		System.out.println("[+] Units: " + this.units);
		this.checkSpeed();
    }
    
    public void checkSpeed(){
        if (this.speed > this.maxSpeed || this.speed < this.minSpeed) {
            System.out.println("[-] The car is breaking speeding rules");
        } else {
            System.out.println("[+] The car is obeying speed limit");
        }
    }
    
    public void toggleMoving() {
        if (this.moving) {
            this.moving = false;
        } else {
            this.moving = true;
        }
    }
    
    public void setMinSpeed(int toMinSpeed) {
        this.minSpeed = toMinSpeed;
    }
    
    public void setMaxSpeed(int toMaxSpeed) {
        this.maxSpeed = toMaxSpeed;
    }
    
    public void setSpeed(int toSpeed) {
        this.speed = toSpeed;
    }
    
	public static void main(String[] args) {
		Main car;
		
		car = new Main();
		
		String prompt = "What would you like the new uints to be? e.g. km/h";
		car.units = car.inputString(prompt);
		
		car.logInfo();
		
	}
}



