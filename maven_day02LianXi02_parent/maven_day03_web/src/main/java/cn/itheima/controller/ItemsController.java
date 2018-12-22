package cn.itheima.controller;

import cn.itheima.pojo.Items;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//万年涛的爸爸
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService is;
    @RequestMapping("/showitems")
    public String findById(Model model){
        System.out.println("双击666");
        Items items = is.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";

    }
}
