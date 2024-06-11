package RoyalCaninTestClass;

public class exam {

    public static void main(String[] args) {
        
        int [] arr = {6, 8, 9, 6};
        
        int max = arr[0];
        int secondMax = arr[1];
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
                
            
        }
        System.out.println(secondMax);
    }
}
