package com.company;

/**
 * Created by student13 on 2014-10-16.
 */
public class Box2<T> {

    private T t;
    public void add( T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
