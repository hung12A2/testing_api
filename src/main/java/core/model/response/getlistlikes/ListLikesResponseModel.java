package core.model.response.getlistlikes;


import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListLikesResponseModel extends BaseResponseModel{
	
	private ListAuctionsData data;
}



