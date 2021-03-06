package com.alby.dp.iterator.example8;

import java.util.Collection;

/**
 * Created by xianwei on 2015/12/7.
 * 定义翻页访问聚合元素的迭代接口
 */
public interface Iterator {
    boolean hasNext();

    Collection next(int num);

    boolean hasPrevious();

    Collection previous(int num);

}
