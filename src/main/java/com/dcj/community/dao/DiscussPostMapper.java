package com.dcj.community.dao;

import com.dcj.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscuddPosts(int userId,int offset,int limit);
    // @Param用于给参数取别名
    //如果只有一个参数并且在<if>里使用就必须加别名
    int selectDisscussPostRows(@Param("userId") int userId);
}
