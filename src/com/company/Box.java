package com.company;

/**
 * Created by student13 on 2014-10-16.
 */
public class Box {

        private Object object;
        public void add(Object object) {
            this.object = object;
        }

        public Object get(){
            return object;
        }
    }
