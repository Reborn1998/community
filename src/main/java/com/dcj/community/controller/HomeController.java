package com.dcj.community.controller;

import com.dcj.community.entity.DiscussPost;
import com.dcj.community.entity.Page;
import com.dcj.community.entity.User;
import com.dcj.community.service.DiscussPostService;
import com.dcj.community.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private Userservice userservice;
    @Autowired
    private DiscussPostService discussPostService;

    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page) {
        // 方法调用前springmvc会自动实例化Model和Page,并将Page注入model
        // 所以在thymeleaf中可以直接访问Page对象中的数据
        page.setRows(discussPostService.findDiscussPostRow(0));
        page.setPath("/index");

        List<DiscussPost> discussPosts = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String,Object> > list = new ArrayList<>();
        if(discussPosts!=null) {
            for(DiscussPost post:discussPosts){
                Map<String,Object> map = new HashMap<>();
                map.put("post",post);
                User user = userservice.findUserById(post.getUserId());
                map.put("user",user);
                list.add(map);
            }
        }
        model.addAttribute("discussPosts",list);

        return "/index";
    }
}
