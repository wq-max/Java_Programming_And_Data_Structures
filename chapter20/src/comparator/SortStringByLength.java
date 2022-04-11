package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLength {

    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        //Arrays.sort(cities,new MyComparator());
        //Arrays.sort(cities,(s1, s2) -> s1.length() - s2.length());
        Arrays.sort(cities, Comparator.comparing(String::length));
        //Arrays.sort(cities);

        for (String s : cities){
            System.out.print(s + " ");
        }
    }

    public static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
