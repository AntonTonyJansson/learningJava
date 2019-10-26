import java.util.ArrayList;

public class testingBits {
    int available;

    public void setAvailable(int button, boolean a) {
        if (a && ((available) & (1 << button)) == 0) {
            available |= (1 << button);
        }
    }

    public void getAvailable(){
        System.out.println("getAvailable:\n");
        ArrayList<Integer> avail_btns = new ArrayList<>();

        int i = 1;
        while (available > (1<<i)){
            if ((available | (1<<(i))) == available){
                System.out.println("Button " + i + " is available!");
                avail_btns.add(i);
            }
            i++;
        }
        /*
        int highestButton = Integer.toBinaryString(available).length()-1;
        for (int i=1;i < highestButton+1;i++){
            if ((available | (1<<(i))) == available){
                System.out.println("Button " + i + " is available!");
                avail_btns.add(i);
            }
        }
         */
        System.out.println("List of available buttons: " + avail_btns);
    }
}
