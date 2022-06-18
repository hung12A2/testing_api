package core.model.response.getslider;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SliderData {
	
	@JsonProperty("slider_id")
	private String sliderId;
	
	private String image;
	
}



