package Exercises.Collections.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        SDAArrayList<Integer> sdaArrayList = new SDAArrayList<>();
        sdaArrayList.add(1);
        sdaArrayList.add(2);
        sdaArrayList.add(4);
        sdaArrayList.add(5);
        sdaArrayList.add(6);
        sdaArrayList.add(8);
        sdaArrayList.add(10);
        System.out.println(sdaArrayList.get(0));
        sdaArrayList.display();
    }
}
