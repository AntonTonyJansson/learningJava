public class Main {


    public static void main(String[] args)
    {
        // Creating an object with buttons added as binary sequences to a class variable of type int
        testingBits tB = new testingBits();
        tB.setAvailable(3, true);
        tB.setAvailable(5, true);
        tB.setAvailable(1, true);
        tB.setAvailable(2, true);

        // Given the class variable value generated above, get available buttons
        tB.getAvailable();
    }

}