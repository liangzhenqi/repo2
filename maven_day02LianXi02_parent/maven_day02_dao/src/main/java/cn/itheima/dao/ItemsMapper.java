package cn.itheima.dao;

import cn.itheima.pojo.Items;

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

    /*
    * 查询所有
    * 万年涛是二笔
    * */
    List<Items> findAll2();
    /**sad
     * aslkdhjflaisdskgjasdf
     * asdfsadffasdfda
     *
     *
     * /
     *
     }
     ///*/
}
