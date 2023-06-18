package com.study.springclimb.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.springclimb.music.entity.Singer;
import com.study.springclimb.music.dao.SingerDao;
import com.study.springclimb.music.service.SingerService;
import com.study.springclimb.music.utils.PageRequest;
import com.study.springclimb.music.utils.PageUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 歌手(Singer)表服务实现类
 *
 * @author makejava
 * @since 2021-06-10 18:25:23
 */
@Service
public class SingerServiceImpl extends ServiceImpl<SingerDao,Singer> implements SingerService {
    @Resource
    private SingerDao singerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Singer queryById(Integer id) {
        return this.singerDao.queryById(id);
    }

    @Override
    public List<Singer> queryAll() {
        return this.singerDao.findAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Singer> queryAllByLimit(int offset, int limit) {
        return this.singerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Singer singer) {
        return this.singerDao.insert(singer)>0;
    }

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Singer singer) {
        return  this.singerDao.update(singer)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.singerDao.deleteById(id) > 0;
    }

    @Override
    public List<Singer> singerOfName(String name) {
        return singerDao.singerOfName(name);
    }

    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerDao.singerOfSex(sex);
    }

    @Override
    public PageUtils selectSingerByPage(PageRequest pageRequest){
        Page page = this.page(pageRequest.toMybatisPage(),
                      new LambdaQueryWrapper<Singer>()
                        .like(StringUtils.isNotBlank(pageRequest.getSearchKey()),Singer::getName, pageRequest.getSearchKey())
//                        .or()
//                        .like(StringUtils.isNotBlank(pageRequest.getSearchKey()),Singer::getSex, pageRequest.getSearchKey())
//                        .or()
//                        .like(StringUtils.isNotBlank(pageRequest.getSearchKey()),Singer::getBirth, pageRequest.getSearchKey())
//                        .or()
//                        .like(StringUtils.isNotBlank(pageRequest.getSearchKey()),Singer::getLocation, pageRequest.getSearchKey())
        );
        return new PageUtils(page);
    }
}
