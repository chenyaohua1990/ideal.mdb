package com.ideal.mdb.xml.adapter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	@Override
	public Date unmarshal(String v) throws Exception {
		if(v==null||v.isEmpty()){
			return null;
		}
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-mm HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse(v, ofPattern);
		ZoneId zoneId=ZoneId.systemDefault();
		Instant instant = localDateTime.atZone(zoneId).toInstant();
		Date from = Date.from(instant);
		return from;
	}

	@Override
	public String marshal(Date v) throws Exception {
		String dateStr = null;
		if(v!=null){
			
		}
		return dateStr;
	}

}
