package com.onefun.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.onefun.service.VotesService;
import com.onefun.util.JSONResult;
import com.onefun.entity.Votes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.*;
/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : Votes 控制器
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-08-08
 */
@RestController
@Api(value="/votes", description="Votes 控制器")
@RequestMapping("/votes")
public class VotesController {
    private final Logger logger = LoggerFactory.getLogger(VotesController.class);

    @Autowired
    public VotesService votesService;

    /**
     * @description : 通过id获取Votes
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @GetMapping("/getVotesById")
    @ApiOperation(value="通过id获取Votes", notes="通过id获取Votes")
    @ApiImplicitParam(name = "id", paramType="query", value = "VotesID", dataType="integer", required = true)
    public JSONResult<Votes> getVotesById(Integer id) throws Exception{
            JSONResult<Votes> resJson = new JSONResult<>();
            Votes param= votesService.selectOneByObj(id);
            resJson.setData(param);
            resJson.setStatus(0);
            return resJson;
    }

    /**
     * @description : 通过id删除Votes
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @GetMapping("/deleteVotesById")
    @ApiOperation(value="通过id删除Votes", notes="通过id删除Votes")
    @ApiImplicitParam(name = "id", paramType="query", value = "VotesID", dataType="integer", required = true)
    public JSONResult<Votes> deleteVotesById(Integer id) throws Exception{
            JSONResult<Votes> resJson = new JSONResult<>();
            boolean boo=votesService.deleteById(id);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 通过id更新Votes
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
    @PostMapping("/updateVotesById")
    @ApiOperation(value="通过id更新Votes", notes="通过id更新Votes")
    public JSONResult<Votes> updateVotesById(@ApiParam(name="Votes",value="Votes 实体类") @RequestBody Votes param) throws Exception{
            JSONResult<Votes> resJson = new JSONResult<>();
            boolean boo=votesService.updateById(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }

    /**
     * @description : 添加Votes
     * ---------------------------------
     * @author : Lin_huanwen123
     * @since : Create in 2018-08-08
     */
	@PostMapping("/addVotes")
    @ApiOperation(value="添加Votes", notes="添加Votes")
    public JSONResult<Votes> addVotes(@ApiParam(name="Votes",value="Votes 实体类") @RequestBody Votes param) throws Exception{
            JSONResult<Votes> resJson = new JSONResult<>();
            boolean boo=votesService.insert(param);
            resJson.setStatus(boo?0:1);
            return resJson;
    }
}
