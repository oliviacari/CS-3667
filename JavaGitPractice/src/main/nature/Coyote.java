package main.nature;

public class Coyote extends Canine {
    public Coyote(String speciesName){
        super(speciesName);
    }
    public void hunt(){
        System.out.println("Coyotes aren't often hunted, but if they show up in a neighborhood they might be.");
    }

    public void play(){
        System.out.println("Coyotes live in smaller packs, so they have family to play with.");
    }
}
