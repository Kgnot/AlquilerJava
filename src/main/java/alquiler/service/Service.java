package alquiler.service;

import java.util.ArrayList;
import java.util.List;

public interface Service<T> {
    void add(T obj);
    T get(int g);
    List<T> getAll();
    T delete(T obj);
}
