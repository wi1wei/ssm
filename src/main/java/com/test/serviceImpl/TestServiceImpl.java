package com.test.serviceImpl;

import com.test.dao.CityMapper;
import com.test.entity.City;
import com.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
	@Resource
	private CityMapper cityMapper;

	@Override
	// @Transactional(rollbackFor = Exception.class, propagation =
	// Propagation.REQUIRES_NEW)
	public List<City> getAll() {
		return cityMapper.getAll();
	}

}
