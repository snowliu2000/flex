package com.xjy.app.sales.fallback;

import com.xjy.app.sales.house.delegate.HouseServiceDelegate;
import com.xjy.app.sales.house.domain.HouseDTO;
import com.xjy.common.web.Result;
import org.springframework.stereotype.Component;

/**
 * @author lsl
 * @version [1.0.0, 2019/7/10,10:16]
 */
@Component
public class ErrorService implements HouseServiceDelegate {
    @Override
    public Result queryByHouseId(Integer houseid) {
        return null;
    }

    @Override
    public Result queryByHouseIds(Integer[] houseids) {
        return null;
    }

    @Override
    public Result querylist(HouseDTO houseDTO) {
        return new Result("The server now cannot use!");
    }
}
