package com.ideal.mdb.bean;

import java.io.Serializable;
/**
 * cxf转换Map
 * @author CYH
 *
 */
public class MapEntry	implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7646785162670387300L;
	
	private String key;
	
	private Object value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
