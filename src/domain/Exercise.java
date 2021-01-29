package domain;
/**
 * Class that represent an exercise
 * @author Illia_R
 */
public class Exercise {
    
    /**
     * Method that fills the array
     * @param array integer array
     */
    public static void fillArray(int[] array){
        int n = (int) Math.ceil(array.length / 2.0) - 1;
        
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
            array[array.length - i - 1] = array[i];
        }
    }
}
