package me.flyray.crm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import me.flyray.crm.api.MerchantBaseService;
import me.flyray.crm.dao.MerchantBaseDao;
import me.flyray.crm.model.MerchantBase;

/** 
* @author: bolei
* @date：2017年4月6日 下午10:29:23 
* @description：商户基础信息
*/

public class MerchantBaseServiceImpl implements MerchantBaseService{

	@Autowired
	private MerchantBaseDao merchantBaseDao;
	
	@Override
	public MerchantBase queryObject(Long merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MerchantBase> queryList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(MerchantBase merchantBase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MerchantBase merchantBase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}