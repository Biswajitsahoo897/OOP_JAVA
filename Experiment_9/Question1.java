package Experiment_9;
interface Cart { 
    int speed = 0;  
    void run();  
} 
interface Car extends Cart { 
    void stop();  
    void boost();  
} 
class Toyota implements Car { 
    private int speed; 
    public Toyota(int speed) { 
        this.speed = speed; 
    } 
    @Override 
    public void run() { 
        System.out.println("Toyota is running at speed: " + speed); 
    } 
    @Override 
    public void stop() { 
        System.out.println("Toyota has stopped."); 
    } 
    @Override 
    public void boost() { 
        speed += 20;  
        System.out.println("Toyota boosted speed to: " + speed); 
    } 
}
public class Question1 {
    public static void main(String[] args) { 
        Toyota myToyota = new Toyota(60); 
        myToyota.run(); 
        myToyota.boost(); 
        myToyota.stop(); 
    } 
}
