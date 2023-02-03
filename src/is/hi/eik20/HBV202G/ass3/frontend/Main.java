package is.hi.eik20.HBV202G.ass3.frontend;

public class Main {

    public static void main(String[] args) {
        is.hi.eik20.HBV202G.ass3.backend.Greeter greeter = new is.hi.eik20.HBV202G.ass3.backend.Greeter();
        greeter.setEnglish();
        System.out.println(greeter.greet());
        greeter.setGerman();
        System.out.println(greeter.greet());
    }

}
