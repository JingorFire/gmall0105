package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.Impl.UserServiceImpl;
import com.atguigu.gmall.user.service.UserService;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Member;
import java.util.List;

/**
 * @author Jinkex
 * @create 2020-12-18 16:35
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


//根据用户Id查询收货地址
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress= userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;


    }@RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){

        return "hello user";
    }




}
