
package com.xjy.app.sales.worker.dao;

import java.util.List;
import java.util.Map;

import com.xjy.app.sales.worker.domain.Worker;
import org.apache.ibatis.annotations.Mapper;

/**
 * worker数据访问对象接口
 * @author
 */
@Mapper
public interface WorkerDAO {

	/**
	 * 新增实体信息
	 * @param worker 实体对象
	 */
	void insert(Worker worker);

	/**
	 * 更新实体信息
	 * @param worker 实体对象
	 */
	int update(Worker worker);

	/**
	 * 删除实体信息
	 * @param condition 查询条件
	 * @return 被删除的记录条数
	 */
	int delete(Map condition);

	/**
	 * 查询符合条件的实体个数
	 * @param condition 查询条件
	 * @return 符合条件的实体个数
	 */
	int count(Map condition);
	
	/**
	 * 查询符合条件的实体
	 * @param condition 查询条件
	 * @return 符合条件的实体
	 */
	List<Worker> query(Map condition);

	Worker queryByWorkerId(Integer workerid);
}
