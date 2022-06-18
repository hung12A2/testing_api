package core.model.response.getnews;


import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNewsResponseModel extends BaseResponseModel{
	
	private NewsData data;
}



