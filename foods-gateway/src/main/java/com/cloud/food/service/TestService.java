/*
 * @(#)com.cloud.food.service 2020-01-04 11:43
 * @Author <a href="mailto:xyqierkang@gmail.com">ErKang Qi</a>
 * @Blog：https://www.qekang.com
 * Copyright (c) 2019-2020 Shanghai
 * All rights reserved.

 * This software is the confidential and proprietary information of
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 */
package com.cloud.food.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *********************************************************
 *
 * @Author <a href="mailto:xyqierkang@gmail.com">ErKang Qi</a>
 * @Date Created in $ $
 * @Title $.java
 * <p>Description: [ TODO ] </p>
 * <p>Blog: https://www.qekang.com</p>
 * <p>Inc:   </p>
 * <p>Copyright:    </p>
 * <p>Department: Product development </p>
 * *********************************************************
 */

@FeignClient("foods-service")
public interface TestService {

    @GetMapping("/v1/service/hello")
    String hello(@RequestParam(name = "name") String name);

}
