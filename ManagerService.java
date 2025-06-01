package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Manager;

public interface ManagerService {

	public void register(Manager m1);
	public List<Manager> getAllInfo();
	
	public Manager getSingleInfo(int id);
	public void delre(int id);
}
