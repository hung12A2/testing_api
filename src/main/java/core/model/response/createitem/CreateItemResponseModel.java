package core.model.response.createitem;


import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateItemResponseModel extends BaseResponseModel {
	
	private CreateItemData data;
}
