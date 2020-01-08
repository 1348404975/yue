package com.yk.controller;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.pojo.Class;
import com.yk.pojo.Ding;
import com.yk.pojo.dto.pageResult;
import com.yk.service.ClassService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;


@RestController
@RequestMapping("/class")
public class ClassController {
	@Reference
	ClassService classService;
	@Autowired
	FreeMarkerConfig freemarkerConfig;
	@Value("${pagedir}")
	private String pagedir;
	/**
	 * 课程分页列表
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping("/list")
	public pageResult list(int page,int size){
		return classService.list(page,size);
	}
	/**
	 * 课程添加
	 * @param clas
	 * @return
	 */
	@RequestMapping("/add")
	public int add(@RequestBody Class clas){
		return classService.add(clas);
	}
	/**
	 * 上架及生成静态页面
	 * @param id
	 * @return
	 */
	@RequestMapping("/shang")
	public int shang(int id){
		Configuration configuration = freemarkerConfig.getConfiguration();
		try {
			Template template = configuration.getTemplate("item.ftl");
			Class clas = classService.selectById(id);
			Map map = new HashMap<>();
			map.put("clas", clas);
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pagedir+id+".html"),"UTF-8"));
			template.process(map, writer);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return classService.shang(id);
	}
	/**
	 * 下架
	 * @param id
	 * @return
	 */
	@RequestMapping("/xia")
	public int xia(int id){
		return classService.xia(id);
	}
	/**
	 * 根据id查询数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/findById")
	public Class findById(int id){
		return classService.selectById(id);
	}
}
