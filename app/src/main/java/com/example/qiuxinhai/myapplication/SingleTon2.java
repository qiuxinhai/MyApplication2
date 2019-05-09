package com.example.qiuxinhai.myapplication;

public class SingleTon2 {

    private SingleTon2(){

    }
    private static SingleTon2 singleTon2;
    private static synchronized SingleTon2 getInstance(){
        if(singleTon2==null){
            singleTon2=new SingleTon2();
        }
        return singleTon2;
    }


}
