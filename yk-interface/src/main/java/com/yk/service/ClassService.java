package com.yk.service;

import com.yk.pojo.Class;
import com.yk.pojo.Ding;
import com.yk.pojo.dto.pageResult;

public interface ClassService {
	//分页列表
	pageResult list(int page, int size);
	//添加课程
	int add(Class clas);
	//上架及生成静态页
	int shang(int id);
	//下架
	int xia(int id);
	//根据id查询数据
	Class selectById(int id);


}
