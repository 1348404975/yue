package com.yk.service;

import com.yk.pojo.Ding;
import com.yk.pojo.dto.pageResult;

public interface DingService {
	//分页列表
	pageResult list(int page, int size);
	//购买订单
	int save(Ding ding);

}
