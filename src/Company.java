public class Company {
    int n;

    synchronized public void producer(int n){
        this.n =n;

        System.out.println("Produced: " + this.n);
    }

    synchronized public int consumer(int n){
        this.n = n;


        System.out.println("Consumed: "+ this.n);

        return this.n;
    }

}
