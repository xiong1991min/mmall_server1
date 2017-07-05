package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by wilson on 2017/7/5.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
}
