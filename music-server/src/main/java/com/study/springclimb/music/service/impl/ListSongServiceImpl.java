package com.study.springclimb.music.service.impl;

import com.study.springclimb.music.entity.ListSong;
import com.study.springclimb.music.dao.ListSongDao;
import com.study.springclimb.music.service.ListSongService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 歌单包含歌曲列表 服务实现类
 * </p>
 *
 * @author tqz
 * @since 2021-06-20
 */
@Service
public class ListSongServiceImpl extends ServiceImpl<ListSongDao, ListSong> implements ListSongService {

}
