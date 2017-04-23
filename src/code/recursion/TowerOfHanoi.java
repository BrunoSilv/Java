package code.recursion;

/**
 * Created by bruno on 23-04-2017.
 * https://en.wikipedia.org/wiki/Tower_of_Hanoi
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDiscs = 5;
        moveDiscs(numberOfDiscs, "A", "B", "C");
    }

    public static void moveDiscs(int n, String start, String intermediate, String end){
        if (n == 1){
            //Move nth disc to the end pole
            System.out.println("Move " + n + " disc from " + start + " to " + end);
        }else{
            //Move n-1 disc from start pole to the intermediate pole
            moveDiscs(n-1,start,end,intermediate);
            //Move nth disc to the end pole
            System.out.println("Move " + n + " disc from " + start + " to " + end);
            //Moved n-1 discs from intermediate pole to end pole
            moveDiscs(n-1,intermediate,start,end);
        }
    }
}
