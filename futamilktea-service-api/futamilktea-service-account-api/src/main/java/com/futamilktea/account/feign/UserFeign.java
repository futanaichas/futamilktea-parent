package com.futamilktea.account.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.account.feign
 * @ClassName: UserFeign
 * @Description:
 * @date: 2019/8/29 20:36
 */
@FeignClient(name = "account" )
@RequestMapping
public interface UserFeign {

}
