package org.subum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.subum.domain.DataVO;
import org.subum.mapper.DataMapper;

@Service
public class DataServiceImpl implements DataService{

	@Autowired
	DataMapper dataMapper;

	@Override
	public List<DataVO> SelectData() throws Exception {
		
		return dataMapper.getData();
	}
	
	
}
