package com.liuxv.learnssm.firstssm.service;

import com.liuxv.learnssm.firstssm.po.ItemsCustom;
import com.liuxv.learnssm.firstssm.po.ItemsQueryVo;

import java.util.List;

/**
 * created by liuxv on 2018/5/7
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface ItemsService {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;


    //根据id查询商品信息
    /**
     *
     * <p>Title: findItemsById</p>
     * <p>Description: </p>
     * @param id 查询商品的id
     * @return
     * @throws Exception
     */
    ItemsCustom findItemsById(Integer id) throws Exception;

    //修改商品信息
    /**
     *
     * <p>Title: updateItems</p>
     * <p>Description: </p>
     * @param id 修改商品的id
     * @param itemsCustom 修改的商品信息
     * @throws Exception
     */
    void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception;


}
