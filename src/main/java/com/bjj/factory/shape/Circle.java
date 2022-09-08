package com.bjj.factory.shape;

/**
 * 圆类
 */
public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}