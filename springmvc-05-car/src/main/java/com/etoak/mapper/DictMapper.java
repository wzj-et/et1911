package com.etoak.mapper;

import java.util.List;

import com.etoak.bean.Dict;

public interface DictMapper {
	
	/**
	 * 根据groupId查
	 * @param groupId
	 * @return
	 */
	List<Dict> queryList(String groupId);
	
	
	
	
	
	
	
	
}
