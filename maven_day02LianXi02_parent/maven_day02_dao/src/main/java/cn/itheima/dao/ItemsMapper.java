package cn.itheima.dao;

import cn.itheima.pojo.Items;
import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.List;

public interface ItemsMapper {

    /**
     * 根据id查找
     * @param id
     * @return
     */
    public Items findById(Integer id);

    /**
     * 查询所有items
     * @return
     */
    List<Items> findAll();

    /**
     * 保存items
     * @param items
     */
    void save(Items items);

}
