package core.model.response.readnotification;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadNotificationData {
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("is_read")
	private String isRead;
	
}



