/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.controller;

import com.mitrais.cloud.catalogservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mitrais.cloud.catalogservice.dao.ProductDao;

/**
 * @author Santo Haryono Weli
 * @version $Id: ProductController.java, v 0.1 2018-10-29 9:18 Santo Haryono Weli Exp $$
 */

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping(method = RequestMethod.GET, value = "/product")
    public Page<Product> allProduct(Pageable page) {
        return productDao.findAll(page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{slug}")
    public Product productBySlug(@PathVariable String slug) {
        return productDao.findBySlug(slug);
    }
}
