
package com.xjy.app.sales.house.service.impl;


import com.xjy.app.sales.house.delegate.HouseServiceDelegate;

import com.xjy.app.sales.house.domain.HouseDTO;
import com.xjy.app.sales.house.service.HouseService;
import com.xjy.common.web.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * House服务对象实现类
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseServiceDelegate houseServiceDelegate;

    @Override
    public Result queryByHouseId(Integer houseid) {
        return houseServiceDelegate.queryByHouseId(houseid);
    }

    @Override
    public Result queryByHouseIds(Integer[] houseids) {
        return houseServiceDelegate.queryByHouseIds(houseids);
    }

    @Override
    public Result querylist(HouseDTO houseDTO) {
        return houseServiceDelegate.querylist(houseDTO);
    }
}
