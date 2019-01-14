/*
* 文件名: com.ghaoxiang.client.web
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月10日 15:14
* 修改人:
* 修改时间: 2019年01月10日 15:14
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title EurekaClientController
 * @Description
 * @date 2019年01月10日 15:14
 * @since V1.0
 */
@RestController
public class EurekaClientController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/eureka")
    public String home(@RequestParam(value = "name", defaultValue = "ghaoxiangzZ") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
