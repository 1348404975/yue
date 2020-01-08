package com.yk.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yk.mapper.ClassMapper;
import com.yk.pojo.Class;
import com.yk.pojo.Ding;
import com.yk.pojo.dto.pageResult;
import com.yk.service.ClassService;
@Service
public class ClassServiceImpl implements ClassService{
	@Autowired
	ClassMapper classMapper;
	/**
	 * 查询分页列表
	 */
	@Override
	public pageResult list(int page, int size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, size);
		PageInfo<Class> page1=new PageInfo<>(classMapper.selectByExample(null));
		return new pageResult(page1.getTotal(), page1.getList());
	}
	/**
	 * 添加课程
	 */
	@Override
	public int add(Class clas) {
		clas.setFalg("0");
		return classMapper.insert(clas);
	}
	/**
	 * 上架
	 */
	@Override
	public int shang(int id) {
		// TODO Auto-generated method stub
		return classMapper.shang(id);
	}
	/**
	 * 下架
	 */
	@Override
	public int xia(int id) {
		// TODO Auto-generated method stub
		return classMapper.xia(id);
	}
	/**
	 * 根据id查询
	 */
	@Override
	public Class selectById(int id) {
		return classMapper.selectByPrimaryKey(id);
	}

}
