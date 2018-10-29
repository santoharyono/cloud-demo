/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.dao;

import com.mitrais.cloud.catalogservice.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Santo Haryono Weli
 * @version $Id: ProductDao.java, v 0.1 2018-10-29 9:08 Santo Haryono Weli Exp $$
 */
public interface ProductDao extends PagingAndSortingRepository<Product, String> {

    public Product findBySlug(String slug);
}
