package domain;

import java.util.Arrays;

public class Exercise {
    public static int Calculate(int[] array){// приймає масив цілих чисел та повертає друге найбільше число
        if(array.length<2){ // перевіряє чи масив складаєтьсяз з більше ніж 2 чисел
            return 0;// якщо менше 2, то повертає 0
        }
        Arrays.sort(array);//сортує масив за зростанням
        return array[array.length-2];//повертає передостанній елемент масиву(тобто друге найбільше число)
    }
}
