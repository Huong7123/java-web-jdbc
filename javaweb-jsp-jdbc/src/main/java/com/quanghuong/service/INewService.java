package com.quanghuong.service;

import java.util.List;

import com.quanghuong.model.NewModel;
import com.quanghuong.paging.Pageble;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryId);
	NewModel save(NewModel newModel);
	NewModel update(NewModel updateNew);
	void delete (long[] ids);
	List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
	NewModel findOne(long id);
}
