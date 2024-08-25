package main.client;
//Version 1.0
//8/25/2024
//Olivia Jones
import java.util.Scanner;

import main.nature.Canine;
import main.nature.Coyote;
import main.nature.Wolf;



public class Demo{
    
    public static void main(String[] args) {
        System.out.println("Hello! We're going to assign"  
        + " you a type of Canine based on your favorite number!");
        Scanner scanBoy = new Scanner(System.in);
        System.out.println("Enter your favorite number here: ");

        int favNum = scanBoy.nextInt();
        Canine favCanine;


        if (favNum % 2 == 0){
            favCanine = new Coyote("Coyote");
        }
        else{
            favCanine = new Wolf("Wolf");
        }
    
        System.out.println("Awesome, we're now assigning you a Canine!");
        System.out.println("Your favorite number was: " + favNum);
        System.out.println("Your assigned animal is: " + favCanine.getSpeciesName());
        
        System.out.println("Enter what you'd like to name your " + favCanine.getSpeciesName());
        
        scanBoy.nextLine();

        String namey = scanBoy.nextLine();
        System.out.println("HOORAY!! Your " + favCanine.getSpeciesName() + " is now named " + namey);
        System.out.println("Let's find out some cool things about " + namey);

        favCanine.roam();
        favCanine.play();
        favCanine.hunt();
        scanBoy.close();
    }
}
