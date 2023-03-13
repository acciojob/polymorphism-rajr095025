package com.driver;

public class Main {
    public static void main(String [] args){
        Product p = new Product();
        p.product(5,6);
        p.product(5,6,7);
        p.product(5.0,6.0);
    }
}

class Product{
    public int product(int x, int y) {
        return 0;
    }

    public int product(int x, int y, int z) {
        return 1;
    }

    public double product(double x, double y) {
        return 2.0;
    }
}


/*
 * Task 1:
create a class Product inside Main class
Task 2:
create object of Product in Main function called p
Task 3:
create a method of following defination
public int product(int x, int y) {}
call this method from Main using Product class object p
Task 4:
create a Overloaded method product of following defination
public int product(int x, int y, int z) {}
call this method also from Main using Product class object p
Task 5:
create a Overloaded method product of following defination
public double product(double x, double y) {}
call this method also from Main using Product class object p
Observations:
This class contains 3 classes with same name, but it complie & run successfully
 * 
 * 
 */