/*
* 文件名: com.ghaoxiang.feign.web
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月14日 09:00
* 修改人:
* 修改时间: 2019年01月14日 09:00
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.feign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghaoxiang.feign.clients.FeignService;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title FeignController
 * @Description
 * @date 2019年01月14日 09:00
 * @since V1.0
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne(name);
    }
}
