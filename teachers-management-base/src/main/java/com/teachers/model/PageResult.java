package com.teachers.model;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {
    // 数据列表
    private List<T> items;
    // 总记录数
    private long counts;
    // 当前页码
    private long page;
    // 每页记录数
    private long pageSize;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public long getCounts() {
        return counts;
    }

    public void setCounts(long counts) {
        this.counts = counts;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }

    public PageResult() {
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "items=" + items +
                ", counts=" + counts +
                ", page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
