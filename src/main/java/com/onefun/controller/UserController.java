package com.onefun.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.onefun.service.UserService;
import com.onefun.util.JSONResult;
import com.onefun.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.*;
/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : User 控制器
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-08-08
 */
@RestController
@Api(value="/user", description="User 控制器")
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    /**
     * @description : 通过id获取User
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @GetMapping("/getUserById")
    @ApiOperation(value="通过id获取User", notes="通过id获取User")
    @ApiImplicitParam(name = "id", paramType="query", value = "UserID", dataType="integer", required = true)
    public JSONResult<User> getUserById(Integer id) throws Exception{
            JSONResult<User> resJson = new JSONResult<>();
            User param= userService.selectOneByObj(id);
            resJson.setData(param);
            resJson.setStatus(0);
            return resJson;
    }

    /**
     * @description : 通过id删除User
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @GetMapping("/deleteUserById")
    @ApiOperation(value="通过id删除User", notes="通过id删除User")
    @ApiImplicitParam(name = "id", paramType="query", value = "UserID", dataType="integer", required = true)
    public JSONResult<User> deleteUserById(Integer id) throws Exception{
            JSONResult<User> resJson = new JSONResult<>();
            boolean boo=userService.deleteById(id);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 通过id更新User
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @PostMapping("/updateUserById")
    @ApiOperation(value="通过id更新User", notes="通过id更新User")
    public JSONResult<User> updateUserById(@ApiParam(name="User",value="User 实体类") @RequestBody User param) throws Exception{
            JSONResult<User> resJson = new JSONResult<>();
            boolean boo=userService.updateById(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 添加User
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
	@PostMapping("/addUser")
    @ApiOperation(value="添加User", notes="添加User")
    public JSONResult<User> addUser(@ApiParam(name="User",value="User 实体类") @RequestBody User param) throws Exception{
            JSONResult<User> resJson = new JSONResult<>();
            boolean boo=userService.insert(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }
}
