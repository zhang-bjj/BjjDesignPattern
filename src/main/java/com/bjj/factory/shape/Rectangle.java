package com.bjj.factory.shape;

/**
 * 长方形类
 */
public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}