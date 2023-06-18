package com.study.springclimb.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.springclimb.music.dao.SongListDao;
import com.study.springclimb.music.entity.SongList;
import com.study.springclimb.music.service.SongListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 歌单 服务实现类
 * </p>
 *
 * @author tqz
 * @since 2021-06-20
 */
@Service
public class SongListServiceImpl extends ServiceImpl<SongListDao, SongList> implements SongListService {

    @Resource
    private SongListDao dao;
    @Override
    public Boolean insertSongList(SongList songList) {
        return dao.insert(songList)>0;
    }
}
