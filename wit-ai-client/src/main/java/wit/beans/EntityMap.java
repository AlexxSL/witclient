package wit.beans;

import java.util.List;
import java.util.stream.Collectors;

import com.google.api.client.util.ArrayMap;

import json.FlexibleMap;

public class EntityMap extends FlexibleMap {
	public List<String> entityValues(String entityId){
        List<ArrayMap<String,String>> entity = (List<ArrayMap<String,String>>) get(entityId);
        if ( entity != null ){
            return entity.stream()
                    .map(am -> am.get("value"))
                    .collect(Collectors.toList());
        }
        return null;
    }
	
	public String firstEntityValue(String entityId){
        List<ArrayMap<String,String>> entity = (List<ArrayMap<String,String>>) get(entityId);
        if ( entity != null ){
            return entity.stream()
                    .map(am -> am.get("value"))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
	
	public long count(String entityId){
        List<ArrayMap<String,String>> entity = (List<ArrayMap<String,String>>) get(entityId);
        if ( entity != null ){
            return entity.stream().count();
        }
        return 0l;
    }
} 