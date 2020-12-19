package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Jinkex
 * @create 2020-12-18 17:21
 */

public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();
}
