package domain;

import java.util.Arrays;

public class Exercise {
    public static int Calculate(int[] array){
        if(array.length<2){
            return 0;
        }
        Arrays.sort(array);
        return array[array.length-1];
    }
}
