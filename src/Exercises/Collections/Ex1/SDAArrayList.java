package Exercises.Collections.Ex1;

import java.util.Arrays;

public class SDAArrayList <T> {
    private static final int initialCapacity = 5;
    private Object[] elements;
    private int size;

    public SDAArrayList(){
        elements = new Object[initialCapacity];
    }

    public void add(T element){
        if(size == elements.length){
            increaseArraySize();
        }
        elements[size++] = element;
    }
//    public T remove(){
//
//    }
    public T get(int index){
        if(index <0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bound exception. Please type valid index.");
        }
        return (T) elements[index];
    }

    public void display(){
        for(Object element : elements){
            System.out.println(element);
        }
    }

    public void increaseArraySize(){
        int newIncreasedCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements,newIncreasedCapacity);
    }
}
