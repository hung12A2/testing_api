package core.model.response.readnews;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadNewsData {
	
	@JsonProperty("new_id")
	private String newId;
	
	@JsonProperty("is_read")
	private String isRead;
	
}



