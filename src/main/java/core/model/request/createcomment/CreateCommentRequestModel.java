package core.model.request.createcomment;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentRequestModel {
	
	private String content;
	
	@JsonProperty("comment_last_id")
	private int commentLastId;
	
}
