package main.nature;

public class Wolf extends Canine {
    public Wolf(String speciesName){
        super(speciesName);
    }
    public void hunt(){
        System.out.println("Wolves are often hunted by humans. This makes them more endangered.");
    }

    public void play(){
        System.out.println("Wolves are able to play together since they travel in packs!");
    }
}
