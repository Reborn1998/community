package com.dcj.community.service;

import com.dcj.community.dao.DiscussPostMapper;
import com.dcj.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit) {
        return  discussPostMapper.selectDiscuddPosts(userId, offset, limit);
    }

    public int findDiscussPostRow(int userId) {
        return  discussPostMapper.selectDisscussPostRows(userId);
    }
}
