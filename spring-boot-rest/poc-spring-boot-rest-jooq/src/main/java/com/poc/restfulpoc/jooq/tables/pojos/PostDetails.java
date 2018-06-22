/*
 * This file is generated by jOOQ.
*/
package com.poc.restfulpoc.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PostDetails implements Serializable {

    private static final long serialVersionUID = 1419072128;

    private String    createdBy;
    private Timestamp createdOn;
    private Long      postId;

    public PostDetails() {}

    public PostDetails(PostDetails value) {
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.postId = value.postId;
    }

    public PostDetails(
        String    createdBy,
        Timestamp createdOn,
        Long      postId
    ) {
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.postId = postId;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Long getPostId() {
        return this.postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PostDetails (");

        sb.append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(postId);

        sb.append(")");
        return sb.toString();
    }
}
