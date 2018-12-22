package cn.itheima.service;

import cn.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    public abstract Items findById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();
}
