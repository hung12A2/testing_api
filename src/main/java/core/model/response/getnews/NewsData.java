package core.model.response.getnews;

import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsData {
	
	private List<NewsData> news;
	private String total;
	
}



