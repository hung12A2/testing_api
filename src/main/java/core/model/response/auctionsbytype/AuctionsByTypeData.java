package core.model.response.auctionsbytype;

import java.util.List;

import core.model.common.AuctionData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionsByTypeData {
    private List<AuctionData> auctions;
    private String type;
    private String total;
}
