public class Consumer extends Thread{

    Company c;
    public Consumer(Company c){
        this.c = c;

    }

    public void run(){
        int i=1;
        while(true){
            try {
                this.c.consumer(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
