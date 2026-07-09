package Arrayprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestingUnique {
    public static void main(String[] args) {
        Integer arr[]={4,3,2,4,4,15,2,7,8,4,16,8};
        //HashSet<Integer> obj=new HashSet<>(Arrays.asList(arr));
        //LinkedHashSet<Integer> obj=new LinkedHashSet<>(Arrays.asList(arr));
        TreeSet<Integer> obj =new TreeSet<>(Arrays.asList(arr));
        System.out.println(obj);
    }
}
