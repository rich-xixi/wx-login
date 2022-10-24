package com.sneakers.spring_boot_sneakers.service;

import com.sneakers.spring_boot_sneakers.entity.SUser;
import org.springframework.stereotype.Service;

/**
 * 用户表，用于记录用户信息（微信用户）(SUser)表服务接口
 *
 * @author makejava
 * @since 2022-10-24 11:31:49
 */

@Service
public interface SUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SUser queryById(Integer id);


    /**
     * 新增数据
     *
     * @param sUser 实例对象
     * @return 实例对象
     */
    SUser insert(SUser sUser);

    /**
     * 修改数据
     *
     * @param sUser 实例对象
     * @return 实例对象
     */
    SUser update(SUser sUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
