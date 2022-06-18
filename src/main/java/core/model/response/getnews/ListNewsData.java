package core.model.response.getnews;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNewsData {
	
	@JsonProperty("user_id")
	private String userId;
	
	private String title;
	
	private String content;
	
	@JsonProperty("createdAt")
	private String created_at;
	
	@JsonProperty("updatedAt")
	private String updated_at;
	
}



