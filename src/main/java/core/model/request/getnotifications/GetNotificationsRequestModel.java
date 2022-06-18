package core.model.request.getnotifications;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetNotificationsRequestModel {
	
	@JsonProperty("is_not_read")
	private String isNotRead;
}
