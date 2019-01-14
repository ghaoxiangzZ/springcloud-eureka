/*
* 文件名: com.ghaoxiang.ribbon.web
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月13日 15:23
* 修改人:
* 修改时间: 2019年01月13日 15:23
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghaoxiang.ribbon.service.RibbonService;
import com.netflix.discovery.converters.Auto;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title RibbonController
 * @Description
 * @date 2019年01月13日 15:23
 * @since V1.0
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
}
