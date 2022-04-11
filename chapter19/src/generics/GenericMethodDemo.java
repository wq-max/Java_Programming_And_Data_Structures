package generics;

public class GenericMethodDemo {

    public static void main(String[] args) {
        Integer[] integers = {1, 2 , 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};

        print(integers);
        print(strings);
    }

    public static <E> void print(E[] list){
        for (E o : list)
            System.out.print(o + " ");
        System.out.println();
    }
}
