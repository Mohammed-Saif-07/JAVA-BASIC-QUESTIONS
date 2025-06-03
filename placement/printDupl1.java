package placement;

import java.util.*;
public class printDupl1 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,3,4};
        Set <Integer> set = new HashSet<>();
        Set <Integer> dupli = new HashSet<>();
        for(int i : arr){
            if(!set.add(i)){
                dupli.add(i);
            }
        }
        for(int dup : dupli){
            System.out.print(dup+" ");
        }
    }
}
