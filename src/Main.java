//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company c = new Company();

        Producer p = new Producer(c);
        Consumer cc = new Consumer(c);

        p.start();
        cc.start();
    }
}