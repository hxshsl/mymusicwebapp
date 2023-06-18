package com.study.springclimb.music.service;

import com.study.springclimb.music.entity.SongList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 歌单 服务类
 * </p>
 *
 * @author tqz
 * @since 2021-06-20
 */
public interface SongListService extends IService<SongList> {
   Boolean insertSongList(SongList songList);
}
