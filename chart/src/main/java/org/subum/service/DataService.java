package org.subum.service;

import java.util.List;

import org.subum.domain.DataVO;

public interface DataService {

	public List<DataVO> SelectData() throws Exception;
	
}
