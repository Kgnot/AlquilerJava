package alquiler.service;

import java.util.ArrayList;

public interface Service<T> {
    void add(T obj);
    T get(int g);
    ArrayList<T> getAll();
    T delete(T obj);
}
