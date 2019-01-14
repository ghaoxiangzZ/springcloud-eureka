/*
* 文件名: com.ghaoxiang.ribbon.service
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月13日 15:19
* 修改人:
* 修改时间: 2019年01月13日 15:19
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title RibbonService
 * @Description
 * @date 2019年01月13日 15:19
 * @since V1.0
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/eureka?name="+name,String.class);
    }
}
