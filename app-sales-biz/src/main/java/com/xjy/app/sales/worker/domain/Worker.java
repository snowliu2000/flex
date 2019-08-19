
package com.xjy.app.sales.worker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * worker实体类
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
	
	/**
	 * workerid
	 */
	private Integer workerid;
	
	/**
	 * workername
	 */
	private String workername;
	
	/**
	 * createtime
	 */
	private java.util.Date createtime;
	
	/**
	 * 0:在用 1:删除
	 */
	private Integer isdeleted;
	
	/**
	 * deletetime
	 */
	private java.util.Date deletetime;
	
	/**
	 * age
	 */
	private Integer age;
	
	/**
	 * workerno
	 */
	private String workerno;
	
	/**
	 * arrivaldate
	 */
	private java.util.Date arrivaldate;
	
	/**
	 * emergencycontact
	 */
	private String emergencycontact;
	
	/**
	 * educationinfo
	 */
	private String educationinfo;
	
	/**
	 * securityinfo
	 */
	private String securityinfo;
	
	/**
	 * departmentid
	 */
	private Integer departmentid;
	
	/**
	 * worktypeid
	 */
	private Integer worktypeid;
	
	/**
	 * qrcode
	 */
	private byte[] qrcode;
	
	/**
	 * imgname
	 */
	private String imgname;
	
}