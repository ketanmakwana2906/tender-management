package com.hit.dao;

import java.util.List;

import com.hit.beans.BidderBean;

public interface BidderDao {

    public String acceptBid(String applicationId,String tenderId,String vendorId);
	
	public String rejectBid(String applicationId);
	
	public String bidTender(String tenderId, String vendorId,String bidAmount,String deadline);
	
	public List<BidderBean> getAllBidsOfaTender(String tenderId);
	
	public List<BidderBean> getAllBidsOfaVendor(String vendorId);

	String bidTender(String tenderId, String vendorId, String bidAmount, String bidDeadline, int points,String licence);

	List<BidderBean> getAllBidsOfaAccTender(String tenderId);

	String AccacceptBid(String applicationId, String tenderId, String vendorId);

	String acceptBidassign(String applicationId, String tenderId, String vendorId);
	
	
}
