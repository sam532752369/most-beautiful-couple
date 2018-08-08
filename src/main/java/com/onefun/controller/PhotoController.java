package com.onefun.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.onefun.service.PhotoService;
import com.onefun.util.JSONResult;
import com.onefun.entity.Photo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.*;
/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : Photo 控制器
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-08-08
 */
@RestController
@Api(value="/photo", description="Photo 控制器")
@RequestMapping("/photo")
public class PhotoController {
    private final Logger logger = LoggerFactory.getLogger(PhotoController.class);

    @Autowired
    public PhotoService photoService;

    /**
     * @description : 通过id获取Photo
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @GetMapping("/getPhotoById")
    @ApiOperation(value="通过id获取Photo", notes="通过id获取Photo")
    @ApiImplicitParam(name = "id", paramType="query", value = "PhotoID", dataType="integer", required = true)
    public JSONResult<Photo> getPhotoById(Integer id) throws Exception{
            JSONResult<Photo> resJson = new JSONResult<>();
            Photo param= photoService.selectOneByObj(id);
            resJson.setData(param);
            resJson.setStatus(0);
            return resJson;
    }

    /**
     * @description : 通过id删除Photo
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @GetMapping("/deletePhotoById")
    @ApiOperation(value="通过id删除Photo", notes="通过id删除Photo")
    @ApiImplicitParam(name = "id", paramType="query", value = "PhotoID", dataType="integer", required = true)
    public JSONResult<Photo> deletePhotoById(Integer id) throws Exception{
            JSONResult<Photo> resJson = new JSONResult<>();
            boolean boo=photoService.deleteById(id);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 通过id更新Photo
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @PostMapping("/updatePhotoById")
    @ApiOperation(value="通过id更新Photo", notes="通过id更新Photo")
    public JSONResult<Photo> updatePhotoById(@ApiParam(name="Photo",value="Photo 实体类") @RequestBody Photo param) throws Exception{
            JSONResult<Photo> resJson = new JSONResult<>();
            boolean boo=photoService.updateById(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 添加Photo
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
	@PostMapping("/addPhoto")
    @ApiOperation(value="添加Photo", notes="添加Photo")
    public JSONResult<Photo> addPhoto(@ApiParam(name="Photo",value="Photo 实体类") @RequestBody Photo param) throws Exception{
            JSONResult<Photo> resJson = new JSONResult<>();
            boolean boo=photoService.insert(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }
}
