package com.company;

public class DualGenericHolder <T,U> {
    T obj1;
    U obj2;
    DualGenericHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        DualGenericHolder<String, Integer> Obj = new DualGenericHolder<String, Integer>("SimpliCode",10);
        Obj.display();
    }
    // String[] arr = str1.split(" "); split return array typ
    //Array.asList(arr).forEach(s-> System.out.println(s));

    //String newStr1 = str1.substring(1,5);  the last Index have not printed
    //System.out.println(newStr1);
}
