package storm.service;

import java.util.List;

import storm.javaBean.StormBean;
import storm.jdbc.Stormjdbc;

public class StormService {
	
	 public List<StormBean> findAll(){
			return Stormjdbc.findAll();
	 }
}
