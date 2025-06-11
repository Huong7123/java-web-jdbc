package com.quanghuong.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.quanghuong.dao.ICategoryDAO;
import com.quanghuong.model.CategoryModel;
import com.quanghuong.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
	@Inject
	private ICategoryDAO categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}
