package com.quanghuong.mapper;

import java.sql.ResultSet;

import com.quanghuong.model.CategoryModel;
import com.quanghuong.model.NewModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel category =new CategoryModel();
			category.setId(resultSet.getLong("id"));
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
			return category;
		} catch (Exception e) {
			return null;
		}
	}

}
