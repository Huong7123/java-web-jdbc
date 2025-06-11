package com.quanghuong.dao;

import java.util.List;

import com.quanghuong.model.NewModel;
import com.quanghuong.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	NewModel findOne(Long id);
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel updateNew );
	void delete(long id);
	List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
}
