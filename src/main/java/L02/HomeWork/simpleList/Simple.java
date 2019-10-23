package L02.HomeWork.simpleList;

import java.util.Collection;

public interface Simple<E> extends Iterable<E> {
    boolean add(E e);
    <T> boolean addAll(Collection<? super T> c, T... elements);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
