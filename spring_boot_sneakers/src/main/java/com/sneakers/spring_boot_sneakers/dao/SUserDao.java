package com.sneakers.spring_boot_sneakers.dao;

import com.sneakers.spring_boot_sneakers.entity.SUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表，用于记录用户信息（微信用户）(SUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-24 11:31:48
 */
@Mapper
public interface SUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SUser queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param sUser 查询条件
     * @return 总行数
     */
    long count(SUser sUser);

    /**
     * 新增数据
     *
     * @param sUser 实例对象
     * @return 影响行数
     */
    int insert(SUser sUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SUser> entities);

    /**
     * 修改数据
     *
     * @param sUser 实例对象
     * @return 影响行数
     */
    int update(SUser sUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

