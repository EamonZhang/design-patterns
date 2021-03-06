package com.alby.dp.prototype.example4;

/**
 * Created by xianwei on 2015/12/2.
 * 订单的接口
 */
public interface OrderApi {
    /**
     * 获取订单产品数量
     * @return 订单中的产品数量
     */
    public int getOrderProductNum();

    /**
     * 设置订单产品数量
     * @param num 订单产品数量
     */
    public void setOrderProductNum(int num);
}
