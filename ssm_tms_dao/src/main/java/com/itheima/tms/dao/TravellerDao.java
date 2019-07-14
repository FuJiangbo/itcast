package com.itheima.tms.dao;

import com.itheima.tms.domain.Traveller;

import java.util.List;

/**
 * 旅客的数据访问接口
 */
public interface TravellerDao {

    /**
     * 根据订单
     * @param oid
     * @return
     */
    public List<Traveller> findByOid(String oid);


}
