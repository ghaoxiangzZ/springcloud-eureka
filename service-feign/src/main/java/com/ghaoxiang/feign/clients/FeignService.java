/*
* 文件名: com.ghaoxiang.feign.clients
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月14日 08:59
* 修改人:
* 修改时间: 2019年01月14日 08:59
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title FeignService
 * @Description
 * @date 2019年01月14日 08:59
 * @since V1.0
 */
@FeignClient(value = "eureka-client", fallback = FeignServiceHystric.class)
public interface FeignService {

    @RequestMapping(value = "/eureka-client-one", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
