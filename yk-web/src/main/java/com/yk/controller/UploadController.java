package com.yk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yk.common.oss.AliyunOSSClientUtils;
import com.yk.pojo.dto.Result;

@RestController
public class UploadController {
	/**
	 * 利用工具类上传图片
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload")
	public Result upload(MultipartFile file){
		AliyunOSSClientUtils ossClientUtils = new AliyunOSSClientUtils();
		try {
			String uploadImg2Oss = ossClientUtils.uploadImg2Oss(file);
			String imgUrl = ossClientUtils.getImgUrl(uploadImg2Oss);
			return new Result(true, 20000, imgUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result(false, 20001, "上传失败");
	}
}
