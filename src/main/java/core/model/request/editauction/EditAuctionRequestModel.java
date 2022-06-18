package core.model.request.editauction;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditAuctionRequestModel {
	
	@JsonProperty("category_id")
	private int categoryId;
	
	@JsonProperty("start_date")
	private String startDate;
	
	@JsonProperty("end_date")
	private String endDate;
	
	@JsonProperty("title_ni")
	private String titleNi;
	
	public EditAuctionRequestModel() {
		
	}
}
