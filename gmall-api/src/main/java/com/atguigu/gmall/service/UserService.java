package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author Jinkex
 * @create 2020-12-18 16:38
 */
public interface UserService {

    List<UmsMember> getAllUser();


    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}

