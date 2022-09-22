package com.zf.controller;

import com.zf.domain.entity.SysUser;
import com.zf.domain.vo.ResponseVo;
import com.zf.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value = "登录与注销接口管理", tags = "登录与注销接口管理")
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "用户登录接口")
    @PostMapping("/login")
    public ResponseVo login(@RequestBody SysUser user){
        return loginService.login(user);
    }

    @ApiOperation(value = "用户注销接口")
    @PostMapping("/logout")
    public ResponseVo logout(@RequestHeader("token") String token){
        return  loginService.logout();
    }


    @ApiOperation(value = "邮箱验证码获取接口")
    @GetMapping("/code")
    public ResponseVo getCode(String email){
        return loginService.getCode(email);
    }
}
