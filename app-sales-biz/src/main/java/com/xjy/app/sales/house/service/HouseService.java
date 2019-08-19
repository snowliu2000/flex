
package com.xjy.app.sales.house.service;

import com.xjy.app.sales.house.domain.HouseDTO;
import com.xjy.common.web.Result;

/**
 * House服务对象接口
 */
public interface HouseService {

    Result queryByHouseId(Integer houseid);

    Result queryByHouseIds(Integer[] houseids);

    Result querylist(HouseDTO houseDTO);

}
