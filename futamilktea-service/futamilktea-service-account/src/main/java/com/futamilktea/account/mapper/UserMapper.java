package com.futamilktea.account.mapper;

import com.futamilktea.account.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.account.mapper
 * @ClassName: UserMapper
 * @Description: pageHelper文档 https://pagehelper.github.io/docs/howtouse/
 *      mybatis.tk文档 http://www.mybatis.tk/
 * @date: 2019/8/29 20:34
 */
@Component
public interface UserMapper extends Mapper<User> {
}
