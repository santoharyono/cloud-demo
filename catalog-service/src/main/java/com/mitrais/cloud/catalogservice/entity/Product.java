/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * @author Santo Haryono Weli
 * @version $Id: Product.java, v 0.1 2018-10-26 16:41 Santo Haryono Weli Exp $$
 */

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_merchant")
    private Merchant merchant;

    @NotNull
    @NotEmpty
    @Size(max = 10)
    @Column(unique = true)
    private String code;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(unique = true)
    private String slug;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String name;

    @NotNull
    @Min(0)
    private BigDecimal price;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String thumbnail;

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
     * Getter method for property merchant.
     *
     * @return property value of merchant
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Setter method for property merchant.
     *
     * @param merchant value to be assigned to property merchant
     */
    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    /**
     * Getter method for property code.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property code.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property slug.
     *
     * @return property value of slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Setter method for property slug.
     *
     * @param slug value to be assigned to property slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Getter method for property name.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property price.
     *
     * @return property value of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Getter method for property thumbnail.
     *
     * @return property value of thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Setter method for property thumbnail.
     *
     * @param thumbnail value to be assigned to property thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
