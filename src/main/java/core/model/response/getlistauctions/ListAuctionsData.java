package core.model.response.getlistauctions;

import java.util.List;


import core.model.common.AuctionData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListAuctionsData{
	
	private List<AuctionData> auctions;
	
	private int total;
	
}



