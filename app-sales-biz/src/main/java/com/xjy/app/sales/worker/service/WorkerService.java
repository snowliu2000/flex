
package com.xjy.app.sales.worker.service;

import java.util.List;
import java.util.Map;

import com.xjy.app.sales.worker.domain.Worker;

/**
 * worker服务对象接口
 * @author
 */
public interface WorkerService {

	/**
	 * 新增实体信息
	 * @param worker 实体对象
	 */
	void save(Worker worker);

	/**
	 * 更新实体信息
	 * @param worker 实体对象
	 * @return 更新影响的记录条数
	 */
	int update(Worker worker);

	/**
	 * 新增实体信息
	 * @param worker 实体对象
	 */
	void insert(Worker worker);

	/**
	 * 删除实体信息
	 * @param condition 查询条件
	 * @return 被删除的记录条数
	 */
	int delete(Map condition);
	
	/**
	 * 删除实体信息
	 * @param workerid workerid
	 * @return 被删除的记录条数
	 */
	int delete(Integer workerid);
	
	/**
	 * 删除实体信息
	 * @param workerids workerid数组
	 * @return 删除影响的记录条数
	 */
	int delete(Integer[] workerids);

	/**
	 * 查询符合条件的实体个数
	 * @param condition 查询条件
	 * @return 符合条件的实体个数
	 */
	int count(Map condition);

	/**
	 * 查询符合条件的实体
	 * @param condition 查询条件
	 * @param offset 跳过实体数
	 * @param limit 返回最大实体数
	 * @return 符合条件的实体
	 */
	List<Worker> query(Map condition, int offset, int limit);
	
	/**
	 * 查询符合条件的实体
	 * @param condition 查询条件
	 * @return 符合条件的实体
	 */
	List<Worker> query(Map condition);
	
	/**
	 * 根据workerid查询实体
	 * @param workerid workerid
	 * @return 实体
	 */
	Worker queryByWorkerId(Integer workerid);

}
