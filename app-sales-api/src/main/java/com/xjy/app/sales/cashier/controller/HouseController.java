package com.xjy.app.sales.cashier.controller;

import com.xjy.app.sales.house.domain.HouseDTO;
import com.xjy.app.sales.house.service.HouseService;
import com.xjy.common.web.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lsl
 * @Date:2019/4/21
 * @Time:22:07
 * xian缴费一体机，调用户中心查用户信息，调房屋中心查房屋信息
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    @Resource
    HouseService houseService;
    /**
     * 查询单条House信息
     * @param houseid 主键
     * @return 2
     */
    @RequestMapping("/query/{houseid}")
    public Result queryByHouseId(@PathVariable("houseid") Integer houseid) {
        return houseService.queryByHouseId(houseid);
    }
    /**
     * 查询多条House信息
     * @param houseids 主键
     * @return 123
     */
    @RequestMapping("/query/many/{houseids}")
    public Result queryByHouseIds(@PathVariable("houseids") Integer[] houseids) {
        return houseService.queryByHouseIds(houseids);
    }

    /**
     * 查询worker列表
     *
     * @param houseDTO 查询条件
     * @return 返回结果集
     */
    @RequestMapping("query/list")
    public Result querylist(@RequestBody HouseDTO houseDTO) {
        return houseService.querylist(houseDTO);


    }

}
