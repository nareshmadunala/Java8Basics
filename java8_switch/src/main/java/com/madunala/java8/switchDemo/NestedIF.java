package com.madunala.java8.switchDemo;

public class NestedIF {


    public static void main(String[] args) {
        
        String animal = "dog";
  

        if(animal.equals("dog") || animal.equals("cat")){
            System.out.println(" It is a domestic animal ");
        }else if(animal.equals("lion") || animal.equals("tiger")){
            System.out.println(" It is a wild animal ");
        }else{
            System.out.println(" Unknown type ");
        }
    }
}
