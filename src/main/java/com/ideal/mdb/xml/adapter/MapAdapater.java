package com.ideal.mdb.xml.adapter;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.ideal.mdb.bean.MapEntry;

public class MapAdapater extends XmlAdapter<MapEntry[], Map<String,Object>> {

	@Override
	public Map<String, Object> unmarshal(MapEntry[] v) throws Exception {
		if(v!=null&&v.length>0){
			Map<String,Object> map=new HashMap<>();
			for (MapEntry entry: v) {
				map.put(entry.getKey(), entry.getValue());
			}
			return map;
		}
		return null;
	}

	@Override
	public MapEntry[] marshal(Map<String, Object> v) throws Exception {
		if(v!=null&&v.isEmpty()){
			return null;
		}
		MapEntry[] mapEntry=new MapEntry[v.size()];
		int i=0;
		for (Map.Entry<String, Object> entry : v.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			mapEntry[i].setKey(key);
			mapEntry[i].setValue(value);
			i++;
		}
		return mapEntry;
	}

	
	

}
