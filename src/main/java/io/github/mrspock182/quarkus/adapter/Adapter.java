package io.github.mrspock182.quarkus.adapter;

public interface Adapter<T1, T2> {
    T1 cast(T2 t2);
}
