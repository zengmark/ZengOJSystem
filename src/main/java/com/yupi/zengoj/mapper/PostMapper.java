package com.yupi.zengoj.mapper;

import com.yupi.zengoj.model.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
* @author 13123
* @description 针对表【post(帖子)】的数据库操作Mapper
* @createDate 2023-10-14 15:03:56
* @Entity com.yupi.zengoj.model.entity.Post
*/
public interface PostMapper extends BaseMapper<Post> {
    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);
}




