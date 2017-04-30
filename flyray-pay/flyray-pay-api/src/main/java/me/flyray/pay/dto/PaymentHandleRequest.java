package me.flyray.pay.dto;

/** 
* @author: bolei
* @date：2017年2月23日 下午12:29:35 
* @description：支付请求对象
*/

public class PaymentHandleRequest {

	/**
	 * 支付通道编号
	 */
	private String payChannelNo;
	
	/**
	 * 银行编号
	 */
	private String bankCode;
	
	/**
	 * 支付方式
	 */
	private String payMethod;
	
	/**
	 * 商户号
	 */
	private String merchantNo;
	
	/**
	 * 支付订单号
	 * @return
	 */
	private String payOrderNo;
	
	public String getPayChannelNo() {
		return payChannelNo;
	}

	public void setPayChannelNo(String payChannelNo) {
		this.payChannelNo = payChannelNo;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	
}
