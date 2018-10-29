/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.controller;

import com.mitrais.cloud.catalogservice.dao.ProductPhotoDao;
import com.mitrais.cloud.catalogservice.entity.Product;
import com.mitrais.cloud.catalogservice.entity.ProductPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Santo Haryono Weli
 * @version $Id: ProductPhotoController.java, v 0.1 2018-10-29 9:33 Santo Haryono Weli Exp $$
 */

@RestController
public class ProductPhotoController {

    @Autowired
    private ProductPhotoDao productPhotoDao;

    @RequestMapping(method = RequestMethod.GET, value = "/product/{product}/photos")
    public List<ProductPhoto> allProductPhoto(@PathVariable("product")Product product) {
        return productPhotoDao.findByProduct(product);
    }
}
