package com.liuxv.learnssm.firstssm.mapper;


import com.liuxv.learnssm.firstssm.po.ItemsCustom;
import com.liuxv.learnssm.firstssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}