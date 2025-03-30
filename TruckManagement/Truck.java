public class Truck extends Cargo {

    int id;
    static int nextId = 0;

    Truck(String description){
        super(description);
        this.id = nextId;
        nextId++;

        if (this.description.length() <= 0){
            this.description ="New null";
        }

    }

    //getter for id and description

    public int getId(){
        return this.id;
    }

    @Override
    public String getCargo(){
        return this.description;
    }






    public String toString(){
        if(this.description.length() <= 0){
            this.description = "New null";

        }

        return "Truck #" + this.id + " Cargo: " + this.description + "\n";


    }







}
