package main.nature;

public abstract class Canine {
    protected String name;
    //protected int levelOfEndangerment;
    protected String speciesName;

    public Canine(String speciesName){
        this.speciesName = speciesName;
    }
    
    public String getSpeciesName(){
        return this.speciesName;
    }
    public String getName(){
        return this.name;
    }

    /*public int getLevel(){
        return this.levelOfEndangerment;
    }*/

    public void setName(String name){
        this.name = name;
    }

    /*public void setLevel(int levelOfEndangerment){
        if (levelOfEndangerment < 0){
            this.levelOfEndangerment = 0;
        }
        else if (levelOfEndangerment > 10){
            this.levelOfEndangerment = 10;
        }
        else{
            this.levelOfEndangerment = levelOfEndangerment;
        }
    }*/

    public void roam(){
        System.out.println("Time to go outside! Be careful! It's dangerous to explore.");
    }

    public abstract void hunt();
    public abstract void play();


}
