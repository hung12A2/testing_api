package core.model.response.getlistcomments;


import java.util.List;


import core.model.common.CommentData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListCommentsData {
	

	private List<CommentData> comments;

	private String total;

}
