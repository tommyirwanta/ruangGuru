
package com.gdn.qa.module.ui.test.models.response;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @Expose
    private List<Datum> data;
    @Expose
    private Long page;
    @Expose
    private Long pageSize;
    @Expose
    private String recommendationID;
    @Expose
    private String searchAlgoID;
    @Expose
    private Long totalCourse;
    @Expose
    private Long totalPage;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public String getRecommendationID() {
        return recommendationID;
    }

    public void setRecommendationID(String recommendationID) {
        this.recommendationID = recommendationID;
    }

    public String getSearchAlgoID() {
        return searchAlgoID;
    }

    public void setSearchAlgoID(String searchAlgoID) {
        this.searchAlgoID = searchAlgoID;
    }

    public Long getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(Long totalCourse) {
        this.totalCourse = totalCourse;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

}
