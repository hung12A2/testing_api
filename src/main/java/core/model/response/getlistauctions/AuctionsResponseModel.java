package core.model.response.getlistauctions;


import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionsResponseModel extends BaseResponseModel{
	
	private ListAuctionsData data;
}



