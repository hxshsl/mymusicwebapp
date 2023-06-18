package com.study.springclimb.music.service.impl;

import com.study.springclimb.music.entity.Comment;
import com.study.springclimb.music.dao.CommentDao;
import com.study.springclimb.music.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author tqz
 * @since 2021-06-21
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

}
