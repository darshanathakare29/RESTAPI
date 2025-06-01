package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Manager;
import com.example.demo.Service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	ManagerService ms;

	@PostMapping("/SaveManagerInfo")   //Http method,used to insert record
	public String one(@RequestBody Manager m1) {
		ms.register(m1);
		return "Record saved";
	}
	
	@GetMapping("/fetchall")
	public List<Manager> two(){
		List<Manager>l1=ms.getAllInfo();
	return l1;
	}
	
	@GetMapping("/fetchSingleInfo/{id}")
	public Manager three(@PathVariable int id) {
		Manager m=ms.getSingleInfo(id);
		return m;
	}
	
	@DeleteMapping("del/{id}")
	public String four(@PathVariable int id) {
		ms.delre(id);
		return "record deleted";
	}
	
	@PutMapping("/updatemanager/{id}")
	public String five(@RequestBody Manager m1,@PathVariable int id) {
		Manager m=ms.getSingleInfo(id);

		if(m1.getMname()!=null) m.setMname(m1.getMname());
		if(m1.getMemail()!=null) m.setMemail(m1.getMemail());
		if(m1.getMpass()!=null) m.setMpass(m1.getMpass());
		
		
		ms.register(m1);
		
		return "Record updated";
	}
}
