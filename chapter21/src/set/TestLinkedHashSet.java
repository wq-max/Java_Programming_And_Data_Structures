package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }

        System.out.println();

        set.forEach(e -> System.out.print(e.toLowerCase() + " "));
    }
}
