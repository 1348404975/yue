package com.yk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yk.mapper.DingMapper;
import com.yk.pojo.Ding;
import com.yk.pojo.dto.pageResult;
import com.yk.service.DingService;
@Service
public class DingServiceImpl implements DingService{
	@Autowired
	DingMapper dingMapper;
	/**
	 * 列表分页
	 */
	@Override
	public pageResult list(int page, int size) {
		PageHelper.startPage(page, size);
		PageInfo<Ding> page1=new PageInfo<>(dingMapper.selectByExample(null));
		return new pageResult(page1.getTotal(), page1.getList());
	}
	/**
	 * 添加订单
	 */
	@Override
	public int save(Ding ding) {
		ding.setFalg("0");
		return dingMapper.insert(ding);
	}

}
