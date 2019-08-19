
package com.xjy.app.sales.worker.controller;


import com.xjy.app.sales.worker.domain.Worker;
import com.xjy.app.sales.worker.service.WorkerService;
import com.xjy.common.web.QueryParam;
import com.xjy.common.web.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author
 */
@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    /**
     * 查询worker列表
     *
     * @param params 查询条件
     * @return 返回结果集
     */
    @RequestMapping("query/list")
    public Result query(QueryParam params) {
        return new Result(workerService.query(params.getData()), workerService.count(params.getDataWithoutPagination()));
    }

    /**
     * 查询单条worker信息
     *
     * @param workerid 主键
     * @return
     */
    @RequestMapping("query/one")
    public Result queryByWorkerId(@RequestParam("workerid") Integer workerid) {
        return new Result(workerService.queryByWorkerId(workerid));
    }

    /**
     * 保存worker信息
     *
     * @param worker
     * @return
     */
    @RequestMapping("save")
    public Result save(Worker worker) {
        return null;
    }

    /**
     * 删除worker信息
     *
     * @param workerid 主键
     * @return
     */
    @RequestMapping("delete")
    public Result delete(Integer workerid) {
        workerService.delete(workerid);
        return new Result();
    }

}
