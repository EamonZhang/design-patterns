package com.alby.dp.singleton.example7;

/**
 * Created by xianwei on 2015/11/29.
 * 双重检查加锁机制
 */
public class Singleton {
    /**
     * 对保存实例的变量添加volatile的修饰
     */
    private volatile static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        //先检查实例是否存在，不存才进入下面的同步块
        if (instance==null){
            //同步块，线程安全的创建实例
            synchronized (Singleton.class){
                //再次检查实例是否存在，不存在则创建实例
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }

}
