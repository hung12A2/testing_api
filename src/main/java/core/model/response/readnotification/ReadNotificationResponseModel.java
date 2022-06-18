package core.model.response.readnotification;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadNotificationResponseModel extends BaseResponseModel{
	
	private ReadNotificationData data;
}



