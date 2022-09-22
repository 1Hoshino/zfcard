package com.zf.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zf.domain.entity.CompanyImg;
import com.zf.domain.entity.CompanyInfo;
import com.zf.domain.entity.SysUser;
import com.zf.domain.vo.CompanyProfileVo;
import com.zf.domain.vo.ResponseVo;
import com.zf.enums.AppHttpCodeEnum;
import com.zf.mapper.CompanyImgMapper;
import com.zf.mapper.CompanyInfoMapper;
import com.zf.mapper.CompanyProfileVoMapper;
import com.zf.mapper.SysUserMapper;
import com.zf.service.CompanyImgService;
import com.zf.service.CompanyInfoService;
import com.zf.service.CompanyProfileVoService;
import com.zf.utils.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/companyprofile")
@Api(tags = "个性化简介")
public class CompanyProfileController {


    @Autowired
    private CompanyProfileVoService companyProfileVoService;

    @Autowired
    private CompanyImgService companyImgService;
    @ApiOperation(value = "顶部图片接口")
    @GetMapping("/company_pictures")
    public ResponseVo companyPictures(@RequestHeader("token") String token) {

        return companyImgService.getcompanyPictures(token);

    }
    @ApiOperation(value = "个性化简介名称及内容接口")
    @GetMapping("/company_profile")
    public ResponseVo companyProfile(@RequestHeader("token") String token) {
        return companyProfileVoService.getcompanyProfile(token);

    }
}
