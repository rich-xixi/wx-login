package com.sneakers.spring_boot_sneakers.service.impl;

import com.sneakers.spring_boot_sneakers.entity.SUser;
import com.sneakers.spring_boot_sneakers.dao.SUserDao;
import com.sneakers.spring_boot_sneakers.service.SUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 用户表，用于记录用户信息（微信用户）(SUser)表服务实现类
 *
 * @author makejava
 * @since 2022-10-24 11:31:50
 */
@Service("sUserService")
public class SUserServiceImpl implements SUserService {
    @Resource
    private SUserDao sUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SUser queryById(Integer id) {
        return this.sUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    /**
     * 新增数据
     *
     * @param sUser 实例对象
     * @return 实例对象
     */
    @Override
    public SUser insert(SUser sUser) {
        this.sUserDao.insert(sUser);
        return sUser;
    }

    /**
     * 修改数据
     *
     * @param sUser 实例对象
     * @return 实例对象
     */
    @Override
    public SUser update(SUser sUser) {
        this.sUserDao.update(sUser);
        return this.queryById(sUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sUserDao.deleteById(id) > 0;
    }
}
