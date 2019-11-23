package org.subum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.subum.domain.DataVO;
import org.subum.service.DataService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/chart/*")
public class ChartController {

	@Autowired
	DataService dataService;
	
	@GetMapping("/list")
	public void getList(Model model) throws Exception {
		
		List<DataVO> DataList = dataService.SelectData();
		model.addAttribute("data", DataList);
		log.info(model);
	
		
	}
	
	
	
}
