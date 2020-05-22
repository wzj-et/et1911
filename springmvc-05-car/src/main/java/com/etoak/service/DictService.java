package com.etoak.service;

import java.util.List;

import com.etoak.bean.Dict;

public interface DictService {
	
	/**
	 * 根据groupId查
	 * @param groupId
	 * @return
	 */
	List<Dict> quetyList(String groupId);
	

}
