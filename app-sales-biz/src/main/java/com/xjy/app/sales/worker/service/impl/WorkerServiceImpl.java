
package com.xjy.app.sales.worker.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.xjy.app.sales.worker.dao.WorkerDAO;
import com.xjy.app.sales.worker.service.WorkerService;
import com.xjy.common.util.BeanUtil;
import com.xjy.common.util.exception.BizException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xjy.app.sales.worker.domain.Worker;


/**
 * worker服务对象实现类
 *
 * @author
 */
@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerDAO workerDAO;


    @Override
    public void save(Worker worker) {
        if (worker.getWorkerid() == null) {

            workerDAO.insert(worker);
        } else {
            workerDAO.update(worker);
        }
    }

    @Override
    public void insert(Worker worker) {

        workerDAO.insert(worker);
    }

    @Override
    public int update(Worker worker) {
        return workerDAO.update(worker);
    }

    @Override
    public int delete(Map condition) {
        return workerDAO.delete(condition);
    }

    @Override
    public int delete(Integer workerid) {
        if (workerid == null) {
            return 0;
        }
        Map condition = new HashMap();
        condition.put("workerid", workerid);
        return delete(condition);
    }

    @Override
    public int delete(Integer[] workerids) {
        int result = 0;
        if (workerids != null) {
            for (int i = 0; i < workerids.length; i++) {
                result += delete(workerids[i]);
            }
        }
        return result;
    }

    @Override
    public int count(Map condition) {
        return workerDAO.count(condition);
    }

    @Override
    public List<Worker> query(Map condition, int offset, int limit) {
        condition.put("offset", offset);
        condition.put("limit", limit);
        return workerDAO.query(condition);
    }

    @Override
    public List<Worker> query(Map condition) {
        return workerDAO.query(condition);
    }

    @Override
    public Worker queryByWorkerId(Integer workerid) {
        if (workerid == null || workerid <= 0) {
            throw new BizException("workerid不能小于0，必须为正整数！");
        }
        if (workerDAO.queryByWorkerId(workerid) != null) {
            return workerDAO.queryByWorkerId(workerid);
        }else {
            return null;
        }

    }

}
