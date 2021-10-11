package com.dcj.community;

import com.dcj.community.dao.DiscussPostMapper;
import com.dcj.community.dao.UserMapper;
import com.dcj.community.entity.DiscussPost;
import com.dcj.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }
    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("1234");
        user.setSalt("as");
        user.setEmail("test@qq.com");
        user.setHeaderUrl( "http://www.nowcoder.com/123.png");
        user.setCreateTime(new Date());
        int row = userMapper.insertUser(user);
        System.out.println(row);
    }

    @Test
    public void updateUser() {
        userMapper.updateStatus(150,1);
    }

    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testSelectPost() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscuddPosts(149, 0, 10);
        for (DiscussPost post:discussPosts
             ) {
            System.out.println(post);

        }
        int rows = discussPostMapper.selectDisscussPostRows(149);
        System.out.println(rows);
    }
}
