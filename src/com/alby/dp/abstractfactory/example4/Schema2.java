package com.alby.dp.abstractfactory.example4;

/**
 * Created by xianwei on 2015/11/30.
 * 装机方案二
 */
public class Schema2 implements AbstractFactory{
    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        if (type==1){
            retObj = new AMDCPU(939);
        }else if (type == 2){
            retObj = new MSIMainboard(939);
        }
        return retObj;
    }
}
