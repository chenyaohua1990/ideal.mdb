package com.ideal.mdb.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ideal.mdb.xml.adapter.DateAdapter;
@XmlRootElement(name="TASK")
public class Task implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1276534771061484911L;
	private Date createDate;
	private Date updateDate;
	private String id;
	private String name;
	private String info;
	private String configParam;
	public Date getCreateDate() {
		return createDate;
	}
	@XmlElement(name="CREATE_DATE")
	@XmlJavaTypeAdapter( value =DateAdapter.class)
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	@XmlElement(name="UPDATE_DATE")
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getId() {
		return id;
	}
	@XmlElement(name="ID")
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement(name="NAME")
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	@XmlElement(name="INFO")
	public void setInfo(String info) {
		this.info = info;
	}
	public String getConfigParam() {
		return configParam;
	}
	@XmlElement(name="CONFIG_PARAM")
	public void setConfigParam(String configParam) {
		this.configParam = configParam;
	}
	
	
}
