package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Manager;
import com.example.demo.Repo.ManagerRepo;
import com.example.demo.Service.ManagerService;

@Service
public class ManagerDao implements ManagerService{

	@Autowired
	ManagerRepo mr;
	@Override
	public void register(Manager m1) {
		// TODO Auto-generated method stub
		mr.save(m1);
		
		
	}
	@Override
	public List<Manager> getAllInfo() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}
	@Override
	public Manager getSingleInfo(int id) {
		// TODO Auto-generated method stub
		return mr.findById(id).orElse(null);
	}
	@Override
	public void delre(int id) {
		// TODO Auto-generated method stub
	 mr.deleteById(id);
	}

}
