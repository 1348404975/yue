package com.yk.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.pojo.Ding;
import com.yk.pojo.dto.pageResult;
import com.yk.service.DingService;

@RestController
@RequestMapping("/ding")
public class DingController {
	@Reference
	DingService dingService;
	/**
	 * 列表及分页查询
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping("/list")
	public pageResult list(int page,int size){
		return dingService.list(page,size);
	}
	/**
	 * 购买订单
	 * @param ding
	 * @return
	 */
	@RequestMapping("/save")
	public int save(@RequestBody Ding ding){
		return dingService.save(ding);
	}
}
