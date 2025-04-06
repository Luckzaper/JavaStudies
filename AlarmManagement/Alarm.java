public class Alarm extends Thread{
    private int timer;
    private String name;
    private int id;
    static int nextId = 1;

    public Alarm(String name,int timer){
        this.id = nextId;
        nextId++;

        if (name.length() == 0){
            this.name = "Alarm " + this.id;
        }else{
            this.name = name;
        }

        int timerUpdated = timer * 1000;
        this.timer = timerUpdated;
    }

    @Override
    public void run(){

        try {
            Thread.sleep(this.timer);
            for (int i = this.timer / 1000; i < 0; i--) {
                if (this.timer == 10000) {
                    System.out.print(this.name + " will go off int 10 seconds");
                }}

        }catch (InterruptedException e) {
            System.out.println(this.name + " has been interrupted at " + this.timer / 1000 + " seconds.");
        }
            System.out.print(this.name + " has gone off!");



    }

    @Override
    public String toString(){
        return this.name + "is currently at " + this.timer + "seconds";
    }

}
