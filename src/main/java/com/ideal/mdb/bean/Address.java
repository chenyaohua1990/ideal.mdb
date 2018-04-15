package com.ideal.mdb.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="地址实体",parent=Serializable.class)
@XmlRootElement(name="ADDRESS")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8285282817285961445L;
	@ApiModelProperty(name="country",value="国家",example="中国")
	private String country;
	@ApiModelProperty(name="province",value="省份",example="四川")
	private String province;
	@ApiModelProperty(name="city",value="市",example="成都")
	private String city;
	@ApiModelProperty(name="area",value="区/县",example="高新区")
	private String area;
	@ApiModelProperty(name="detailed",value="详细地址",example="龙岗街道办二巷三栋5楼")
	private String detailed;
	
	public String getCountry() {
		return country;
	}
	@XmlElement(name="COUNTRY")
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	@XmlElement(name="PROVINCE")
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	@XmlElement(name="CITY")
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	@XmlElement(name="AREA")
	public void setArea(String area) {
		this.area = area;
	}
	public String getDetailed() {
		return detailed;
	}
	@XmlElement(name="DETAILED")
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}
	
	
}
