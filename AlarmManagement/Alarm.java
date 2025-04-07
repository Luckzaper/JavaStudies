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
            while(this.timer >0){
                Thread.sleep(1000);
                this.timer -=1000;

                if (this.timer == 10000) {
                    System.out.println(this.name + " will go off in 10 seconds");
                }}
                System.out.println(this.name + " has gone off!");

            }catch (InterruptedException e) {
            System.out.println(this.name + " has been interrupted at " + this.timer / 1000 + " seconds.");
            return;
        }




    }

    @Override
    public String toString(){
        return this.name + " is currently at " + this.timer/1000 + " seconds\n";
    }

}
