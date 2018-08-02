package com.wlgdo.swagger.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("oauth2")
@Api(tags = "oauth2",value = "oauth相关Api")
public class OauthController {
    private static final Logger logger = LoggerFactory.getLogger(OauthController.class);


    @ApiOperation(value = "根据id查询授权信息", notes = "查询授权信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void getStudent(@PathVariable int id) {
        logger.info("开始查询某个学生信息");
    }

    @ApiOperation(value = "根据Id删除该授权 ", notes = "删除授权信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        logger.info("开始查询某个学生信息");
    }
}
