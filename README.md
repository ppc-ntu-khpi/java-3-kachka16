# Звіт о виконання роботи

## Завдання 1

> Модифікувати стартовий код таким чином, щоб метод Calculate класу Exercise містив код обчислення значення у відповідності до обраного вами завдання - 12 варіант. Рядок, який виводиться у результаті виконання методу main класу TestResult теж слід скоригувати у відповідності до специфіки завдання.
> 14 варіант - Знайдіть друге за величиною число у заданому масиві/

1. Клас Exercise перевіряє масив на мінімальну кількість потрібних чисел, сортує масив та повертає передостаннє число.
2. Клас TestResult складається з чисел масиву, зберігає та виводить результат

### Exercise.java
``` java
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

```

### TestResult.java
``` java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,33,2,21,75,68}; //масив з чисел
        int result = Exercise.Calculate(number);//зберігає результат після Calculate
        System.out.println("Penultimate largest number is: " + result);// виводить результат
    }
}

```

## Результат

![task1](https://github.com/ppc-ntu-khpi/java-3-kachka16/blob/master/img/result.png?raw=true)
