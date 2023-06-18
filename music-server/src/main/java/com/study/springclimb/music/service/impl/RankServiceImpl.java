package com.study.springclimb.music.service.impl;

import com.study.springclimb.music.entity.Rank;
import com.study.springclimb.music.dao.RankDao;
import com.study.springclimb.music.service.RankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 评价 服务实现类
 * </p>
 *
 * @author tqz
 * @since 2021-06-21
 */
@Service
public class RankServiceImpl extends ServiceImpl<RankDao, Rank> implements RankService {

    @Resource
    private RankDao dao;

    @Override
    public boolean insertRank(Rank rank) {
        return dao.insert(rank)>0;
    }

    @Override
    public int selectScoreSum(Integer songListId) {
        return dao.selectScoreSum(songListId);
    }

    @Override
    public int selectRankNum(Integer songListId) {
        return dao.selectRankNum(songListId);
    }

    /**
     * 计算平均分
     *
     * @param songListId
     */
    @Override
    public int rankOfSongListId(Integer songListId) {
        //总分数
        int rankNum = dao.selectRankNum(songListId);
        //总人数
        int countNum = dao.selectScoreSum(songListId);
        if(countNum==0){
            return rankNum;
        }
        //平均分=总分数/总人数
        int result=countNum/rankNum;
        if(result==0){
            return 5;
        }
        return result;
    }
}
