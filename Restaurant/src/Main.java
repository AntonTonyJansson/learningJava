


public class Main {


    public static void main(String[] args) {
        // Creating an object with buttons added as binary sequences to a class variable of type int
        testingBits tB = new testingBits();
        tB.setAvailable(3, true);
        tB.setAvailable(5, true);
        tB.setAvailable(1, true);
        tB.setAvailable(2, true);

        // Given the class variable value generated above, get available buttons
        tB.getAvailable();

        int[] testlist = new int[]{
                1,
                2,
                3
        };
        for (int value : testlist) {
            System.out.println(value);
        }
        int iq = 17;
        String intelligenceLevel = iq > 140 ? "Smart" : "Stupid";
        System.out.println(intelligenceLevel);

        int mat[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int[] r : mat) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println(' ');
        }
        testingGUI GUItester = new testingGUI();

    }
}