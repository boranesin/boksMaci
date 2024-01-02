public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ken" , 11 , 40, 90, 10);
        Fighter f2 = new Fighter("Ryu" , 10 , 45,   100,5);
        Match compete = new Match(f1,f2 , 90 , 100);
        compete.run();
    }
}