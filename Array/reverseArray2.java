package Array;

import java.util.*;
public class reverseArray2 {
    static void reverse(Integer myArray[]){
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("reversed array: " + Arrays.asList(myArray));
    } 
    public static void main(String[] args) {
        Integer [] myArray = {10,20,30,40,50};
        System.out.println("original array: " + Arrays.asList(myArray));
        reverse(myArray);
    }  
}

