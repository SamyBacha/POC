/*
 * This file is generated by jOOQ.
*/
package com.poc.restfulpoc.jooq;


import com.poc.restfulpoc.jooq.tables.Address;
import com.poc.restfulpoc.jooq.tables.Customer;
import com.poc.restfulpoc.jooq.tables.Orders;
import com.poc.restfulpoc.jooq.tables.Post;
import com.poc.restfulpoc.jooq.tables.PostComment;
import com.poc.restfulpoc.jooq.tables.PostDetails;
import com.poc.restfulpoc.jooq.tables.PostTag;
import com.poc.restfulpoc.jooq.tables.Tag;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.ADDRESS</code>.
     */
    public static final Address ADDRESS = com.poc.restfulpoc.jooq.tables.Address.ADDRESS;

    /**
     * The table <code>PUBLIC.CUSTOMER</code>.
     */
    public static final Customer CUSTOMER = com.poc.restfulpoc.jooq.tables.Customer.CUSTOMER;

    /**
     * The table <code>PUBLIC.ORDERS</code>.
     */
    public static final Orders ORDERS = com.poc.restfulpoc.jooq.tables.Orders.ORDERS;

    /**
     * The table <code>PUBLIC.POST</code>.
     */
    public static final Post POST = com.poc.restfulpoc.jooq.tables.Post.POST;

    /**
     * The table <code>PUBLIC.POST_COMMENT</code>.
     */
    public static final PostComment POST_COMMENT = com.poc.restfulpoc.jooq.tables.PostComment.POST_COMMENT;

    /**
     * The table <code>PUBLIC.POST_DETAILS</code>.
     */
    public static final PostDetails POST_DETAILS = com.poc.restfulpoc.jooq.tables.PostDetails.POST_DETAILS;

    /**
     * The table <code>PUBLIC.POST_TAG</code>.
     */
    public static final PostTag POST_TAG = com.poc.restfulpoc.jooq.tables.PostTag.POST_TAG;

    /**
     * The table <code>PUBLIC.TAG</code>.
     */
    public static final Tag TAG = com.poc.restfulpoc.jooq.tables.Tag.TAG;
}
