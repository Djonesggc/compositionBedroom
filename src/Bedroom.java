public class Bedroom {
    String name;
    Wall w1;
    Wall w2;
    Wall w3;
    Wall w4;

    Ceiling ceil;

    Bed bed;
    Lamp lamp;

    public Bedroom() {

    }
    public Bedroom(String name, Wall w1, Wall w2, Wall w3, Wall w4, Ceiling ceiling){
        this.name = name;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;


        this.ceil = ceiling;
    }
    public String getName(){
        return name;
    }
    public  Wall getW1(){
        return w1;
    }
    public void makeBed(){
        System.out.println("Bedroom class --> calling makeBed() method");

        //call make() method you declared in the Bedroom class
        this.make();

        //call make() method created
        bed.make();
    }
    public void make(){
        System.out.println("From Bedroom class - make() method");
    }




}