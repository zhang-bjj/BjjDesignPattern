package com.bjj.factory;

import com.bjj.factory.shape.Circle;
import com.bjj.factory.shape.Rectangle;
import com.bjj.factory.shape.Shape;
import com.bjj.factory.shape.Square;

/**
 * 形状工厂类
 */
public class ShapeFactory {
    
   //使用 getShape 方法获取形状类型的对象
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
}