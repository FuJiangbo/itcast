package com.itheima.tms.dao;

import com.itheima.tms.domain.Member;

/**
 * 会员的数据访问接口
 */
public interface MemberDao {

    /**
     * 根据id查询会员
     * @param id
     * @return
     */
    public Member findById(String id);

}
