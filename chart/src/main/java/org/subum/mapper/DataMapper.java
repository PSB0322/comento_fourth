package org.subum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.subum.domain.DataVO;

public interface DataMapper {

	
	@Select("SELECT * FROM product_quality ")
	public List<DataVO> getData();
}
