/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.dao;

import com.mitrais.cloud.catalogservice.entity.Product;
import com.mitrais.cloud.catalogservice.entity.ProductPhoto;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author Santo Haryono Weli
 * @version $Id: ProductPhotoDao.java, v 0.1 2018-10-29 9:15 Santo Haryono Weli Exp $$
 */
public interface ProductPhotoDao extends PagingAndSortingRepository<ProductPhoto, String> {

    public List<ProductPhoto> findByProduct(Product product);
}
