
package com.xjy.app.sales.house.domain;

import lombok.Data;

/**
 * House实体类
 * @author
 */
@Data
public class HouseDTO extends QueryHouseDTO{
	
	/**
	 * houseid
	 */
	private Integer houseid;
	
	/**
	 * roomnumber
	 */
	private String roomnumber;
	
	/**
	 * housename
	 */
	private String housename;
	
	/**
	 * 0:正常 1:删除
	 */
	private Integer isdelete;
	
}