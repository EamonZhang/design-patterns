package com.alby.dp.command.example5;

/**
 * Created by xianwei on 2015/12/6.
 * 热菜师傅
 */
public class HotCook implements CookApi{
    @Override
    public void cook(String name) {
        System.out.println("热菜师傅正在做："+name);
    }
}
