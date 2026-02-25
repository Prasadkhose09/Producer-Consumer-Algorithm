public class Company {
    int n;

    boolean f= false;


    synchronized public void producer(int n) throws InterruptedException {
        if(f)wait();this.n =n;



        System.out.println("Produced: " + this.n);
        f=true;
        notify();
    }

    synchronized public int consumer(int n) throws InterruptedException {
        this.n = n;
        if(!f) wait();
        System.out.println("Consumed: "+ this.n);
        f= false;


        return this.n;
    }

}
