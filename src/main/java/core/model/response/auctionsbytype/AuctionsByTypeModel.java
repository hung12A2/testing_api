package core.model.response.auctionsbytype;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionsByTypeModel extends BaseResponseModel {
    private AuctionsByTypeData data;
}
