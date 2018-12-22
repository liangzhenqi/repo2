package cn.itheima.service.impl;

import cn.itheima.dao.ItemsMapper;
import cn.itheima.pojo.Items;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsservice")
public class ItemsServiceimpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsdao;
    public Items findById(Integer id) {
        return itemsdao.findById(id);
    }
}
