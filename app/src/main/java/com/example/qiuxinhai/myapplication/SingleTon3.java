package com.example.qiuxinhai.myapplication;

public class SingleTon3 {
    private SingleTon3(){

    }
    private static SingleTon3 singleTon3;
    public static SingleTon3 getSingleTon3(){
        if(singleTon3==null){
            synchronized(SingleTon3.class){
                if(singleTon3==null){
                    singleTon3=new SingleTon3();
                }
            }
        }
        return singleTon3;
    }


}
