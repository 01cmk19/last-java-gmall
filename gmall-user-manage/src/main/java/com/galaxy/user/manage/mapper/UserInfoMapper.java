package com.galaxy.user.manage.mapper;

import com.galaxy.user.manage.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;
//咱们自定义的mapper接口,需要继承通用mapper接口并传入泛型具体类型，为咱们mapper操作的类型
public interface UserInfoMapper extends Mapper<UserInfo> {
}
