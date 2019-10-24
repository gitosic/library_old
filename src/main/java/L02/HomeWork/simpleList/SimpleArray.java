package L02.HomeWork.simpleList;

import java.util.Collection;
import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {

    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        strings.add("Раз");
        strings.add("Два");
        strings.add("Три");

        strings.update(1, "Update");
        System.out.println(strings.get(1));
        System.out.println(strings.size());
    }

    private E[] values;

    public SimpleArray(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values,0, temp.length);
            values[values.length - 1] = e;
            return false;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }


    @Override
    public void delete(int index) {
        //https://www.youtube.com/watch?v=R4AxRoCtTns 19 минут.
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}
