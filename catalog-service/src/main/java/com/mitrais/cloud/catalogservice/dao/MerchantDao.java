/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.mitrais.cloud.catalogservice.dao;

import com.mitrais.cloud.catalogservice.entity.Merchant;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Santo Haryono Weli
 * @version $Id: MerchantDao.java, v 0.1 2018-10-29 9:07 Santo Haryono Weli Exp $$
 */
public interface MerchantDao extends PagingAndSortingRepository<Merchant, String> {
    
}
