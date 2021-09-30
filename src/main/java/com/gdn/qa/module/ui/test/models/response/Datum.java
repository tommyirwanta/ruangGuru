
package com.gdn.qa.module.ui.test.models.response;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Datum {

    @Expose
    private Long basePrice;
    @Expose
    private List<Object> categories;
    @Expose
    private String courseDescription;
    @Expose
    private String courseName;
    @Expose
    private String courseSerial;
    @Expose
    private String createdAt;
    @Expose
    private String imageUrl;
    @Expose
    private List<Instructor> instructors;
    @Expose
    private String introductionVideoThumbnailURL;
    @Expose
    private String introductionVideoURL;
    @Expose
    private Boolean isSubscribed;
    @Expose
    private List<String> location;
    @Expose
    private String marketType;
    @Expose
    private String merchantSerial;
    @Expose
    private Long price;
    @Expose
    private Long rating;
    @Expose
    private String slug;
    @Expose
    private List<Object> tags;
    @Expose
    private Long totalRating;
    @Expose
    private String transactional;
    @Expose
    private String updatedAt;

    public Long getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Long basePrice) {
        this.basePrice = basePrice;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSerial() {
        return courseSerial;
    }

    public void setCourseSerial(String courseSerial) {
        this.courseSerial = courseSerial;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public String getIntroductionVideoThumbnailURL() {
        return introductionVideoThumbnailURL;
    }

    public void setIntroductionVideoThumbnailURL(String introductionVideoThumbnailURL) {
        this.introductionVideoThumbnailURL = introductionVideoThumbnailURL;
    }

    public String getIntroductionVideoURL() {
        return introductionVideoURL;
    }

    public void setIntroductionVideoURL(String introductionVideoURL) {
        this.introductionVideoURL = introductionVideoURL;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getMerchantSerial() {
        return merchantSerial;
    }

    public void setMerchantSerial(String merchantSerial) {
        this.merchantSerial = merchantSerial;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Long getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Long totalRating) {
        this.totalRating = totalRating;
    }

    public String getTransactional() {
        return transactional;
    }

    public void setTransactional(String transactional) {
        this.transactional = transactional;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
