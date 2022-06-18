package core.model.response.likeauction;


import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeAuctionResponseModel extends BaseResponseModel{
	
	private LikeAuctionData data;
}
