package com.bjj.factory.shape;

/**
 * 正方形类
 */
public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}