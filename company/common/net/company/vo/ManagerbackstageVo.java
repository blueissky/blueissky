package net.company.vo;

import com.mchange.v2.resourcepool.ResourcePool.Manager;

/**
 * Managerbackstage entity. @author MyEclipse Persistence Tools
 */

public class ManagerbackstageVo implements java.io.Serializable {

	// Fields

	private Integer id;
	private ManagerVo manager;
	private BackstageVo backstage;
	private Boolean enable;

	// Constructors

	/** default constructor */
	public ManagerbackstageVo() {
	}

	/** minimal constructor */
	public ManagerbackstageVo(Boolean enable) {
		this.enable = enable;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ManagerVo getManager() {
		return this.manager;
	}

	public void setManager(ManagerVo manager) {
		this.manager = manager;
	}

	public BackstageVo getBackstage() {
		return this.backstage;
	}

	public void setBackstage(BackstageVo backstage) {
		this.backstage = backstage;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}