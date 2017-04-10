package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.PayChannelInterfaceService;
import me.flyray.pay.dao.PayChannelInterfaceDao;
import me.flyray.pay.model.PayChannelConfig;
import me.flyray.pay.model.PayChannelInterface;

/** 
* @author: bolei
* @date：2017年4月6日 下午10:56:37 
* @description：支付通道接口 
*/

@Service("payChannelInterfaceService")
public class PayChannelInterfaceServiceImpl implements PayChannelInterfaceService{

	@Autowired
	private PayChannelInterfaceDao payChannelInterfaceDao;
	
	@Override
	public PayChannelInterface queryObject(Long id) {
		return payChannelInterfaceDao.queryObject(id);
	}

	@Override
	public List<PayChannelInterface> queryList(Map<String, Object> map) {
		return payChannelInterfaceDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return payChannelInterfaceDao.queryTotal(map);
	}

	@Override
	public void save(PayChannelInterface payChannelInterface) {
		payChannelInterfaceDao.save(payChannelInterface);
	}

	@Override
	public void update(PayChannelInterface payChannelInterface) {
		payChannelInterfaceDao.update(payChannelInterface);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

	

}