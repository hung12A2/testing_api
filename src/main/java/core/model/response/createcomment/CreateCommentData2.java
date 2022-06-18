package core.model.response.createcomment;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentData2 {
	private List<CreateCommentData> comments;
	private String total;
}
