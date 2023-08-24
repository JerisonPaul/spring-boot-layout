package com.layout.hello.dto;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JerisonPaul
 * @date 2023/8/24 下午11:25
 */
public class PageDto<T> implements Serializable {

    private static final long serialVersionUID = -1455105303628778434L;

    /**
     * 当前页
     */
    private int numb;

    /**
     * 每页大小
     */
    private int size;

    /**
     * 总量
     */
    private long total;

    /**
     * 本页封装的数据内容
     */
    private List<T> list;

    public void add(T item) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(item);
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("numb", numb)
                .add("size", size)
                .add("total", total)
                .add("list", list)
                .toString();
    }
}
