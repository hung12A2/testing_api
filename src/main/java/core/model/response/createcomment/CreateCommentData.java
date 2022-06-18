package core.model.response.createcomment;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentData {
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("user_id")
	private int userId; 
	
	private String content;
	
	@JsonProperty("updated_at")
	private String updatedAt;
}
