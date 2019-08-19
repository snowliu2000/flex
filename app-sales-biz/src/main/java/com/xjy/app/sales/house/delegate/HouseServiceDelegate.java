package com.xjy.app.sales.house.delegate;



import com.xjy.app.sales.fallback.ErrorService;
import com.xjy.app.sales.house.domain.HouseDTO;
import com.xjy.app.sales.house.domain.QueryHouseDTO;
import com.xjy.common.web.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author lsl
 * @Date:2019/4/21
 * @Time:20:48
 */
//@FeignClient(name = "xjy-house", url = "${url.houseid}")
@FeignClient(name = "xjy-house",fallback = ErrorService.class)
public interface HouseServiceDelegate {
    /**
     * 查询单条
     * @param houseid
     * @return 返回一条记录
     */
    @RequestMapping(value = "/house/query/one")
    Result queryByHouseId(@PathVariable("houseid") Integer houseid);

    /**
     * 查多条
     * @param houseids
     * @return 返回多条记录
     */
    @RequestMapping(value = "/house/query/many/{houseids}")
    Result queryByHouseIds(@PathVariable("houseids") Integer[] houseids);


    /**
     * @param
     * @return
     */
    @RequestMapping(value = "/house/query/list")
    Result querylist(@RequestBody HouseDTO houseDTO);
}
