package core.model.response.getlistbids;


import java.util.List;


import core.model.common.BidData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListBidsData {
	

	private List<BidData> bids;

	private String total;

}
