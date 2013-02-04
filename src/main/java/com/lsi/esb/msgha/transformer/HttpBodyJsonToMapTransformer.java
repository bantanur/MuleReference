package com.lsi.esb.msgha.transformer;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.mule.transport.http.transformers.HttpRequestBodyToParamMap;

public class HttpBodyJsonToMapTransformer extends HttpRequestBodyToParamMap {


@Override
protected void addQueryStringToParameterMap(String queryString, Map<String, Object> paramMap,String outputEncoding) throws Exception
 {
	 ObjectMapper mapper = new ObjectMapper();
	 Map<String, Object> map = mapper.readValue(queryString, HashMap.class);
	 paramMap.putAll(map);
 }
}
