package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;

import java.util.List;

/**
 * @author Jinkex
 * @create 2020-12-18 16:38
 */
public interface UserService {

    List<UmsMember> getAllUser();


    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}

