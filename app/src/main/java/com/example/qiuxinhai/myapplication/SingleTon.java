package com.example.qiuxinhai.myapplication;

import java.util.HashMap;

public class SingleTon {

   private SingleTon(){

   }
   private static class LazyHolder{
       private static final SingleTon single=new SingleTon();
   }
   public SingleTon getInstance(){
       return LazyHolder.single;
   }

}
