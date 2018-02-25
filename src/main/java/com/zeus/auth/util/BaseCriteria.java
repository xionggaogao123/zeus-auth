package com.zeus.auth.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * @author keven
 * @date 2018-01-26 下午3:09
 * @Description
 */
public abstract class BaseCriteria implements Serializable{

    private static final long serialVersionUID = -6604540094341711604L;

    protected static final ObjectMapper MAPPER = new ObjectMapper();

    public BaseCriteria() {

    }

	@SuppressWarnings("unchecked")
	public Map<String, Object> toMap() {
        return (Map<String, Object>)MAPPER.convertValue(this, Map.class);
    }

    static {
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        MAPPER.registerModule(new GuavaModule());
        MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

}
