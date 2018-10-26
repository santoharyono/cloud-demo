/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Santo Haryono Weli
 * @version $Id: ProductPhoto.java, v 0.1 2018-10-26 16:48 Santo Haryono Weli Exp $$
 */

@Entity
@Table(name = "product_photos")
public class ProductPhoto {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String url;

    @Size(max = 255)
    private String caption;

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property product.
     *
     * @return property value of product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Setter method for property product.
     *
     * @param product value to be assigned to property product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Getter method for property url.
     *
     * @return property value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter method for property url.
     *
     * @param url value to be assigned to property url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter method for property caption.
     *
     * @return property value of caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Setter method for property caption.
     *
     * @param caption value to be assigned to property caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }
}
