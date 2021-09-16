
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
       
        
        /*Bird Liddey = new Bird("xxx", "yyy");
        Liddey.observe();
        System.out.println(Liddey);
        Database db = new Database();
        db.add(Liddey);
        db.observation("xxx");
        System.out.println(Liddey);
        */
        Database data = new Database();    
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                data.add(new Bird(name, nameLatin));
            }
            if(command.equals("Observation")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                if(data.observation(bird) ==false){
                    System.out.println("Not a bird!");                    
                }
                data.observation(bird);
            }
            
            if(command.equals("All")){
                data.printAll();
            }
            
            if(command.equals("One")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                if(data.printOne(bird) == null){
                    System.out.println("Not a bird!");
                }
                System.out.println(data.printOne(bird));
            }
        }
        
    }

}
