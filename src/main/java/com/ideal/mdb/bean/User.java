package com.ideal.mdb.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name="USER")
@ApiModel(description="用户实体")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3384804783113366178L;
	@ApiModelProperty(name="id",value="ID",example="1")
	private String id;
	@ApiModelProperty(name="name",value="用户名",example="张三")
	private String name;
	@ApiModelProperty(name="password",value="密码",example="12345x6")
	private String password;
	@ApiModelProperty(name="email",value="邮箱",example="1233@qq.com")
	private String email;
	@ApiModelProperty(name="addressList",value="地址集合")
	private List<Address> addressList;
	
	
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
	public String getPassword() {
		return password;
	}
	@XmlElement(name="NAME")
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement(name="NAME")
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	//@XmlElementWrapper()
	@XmlElement(name="ADDRESS_LIST")
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

}
