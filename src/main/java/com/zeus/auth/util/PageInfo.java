package com.zeus.auth.util;

import com.google.common.base.MoreObjects;

/**
 * @author keven
 * @desc
 */
public class PageInfo {
    
    public static final String LIMIT = "limit";

    public static final String OFFSET = "offset";
    
    private  Integer offset;
    private Integer limit;
    
    public PageInfo() {

    }
    
    public static PageInfo of(Integer pageNo, Integer size) {
        return new PageInfo(pageNo, size);
    }
    
    public PageInfo(Integer pageNo, Integer size) {
        pageNo = MoreObjects.firstNonNull(pageNo, 1);
        size = MoreObjects.firstNonNull(size, 20);
        limit = size > 0 ? size : 20;
        offset = (pageNo - 1) * size;
        offset = offset > 0 ? offset : 0;
    }
    
    public Integer getOffset() {
        return offset;
    }
    
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getLimit() {
        return limit;
    }
    
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
}
