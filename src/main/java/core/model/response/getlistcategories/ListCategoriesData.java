package core.model.response.getlistcategories;


import java.util.List;


import core.model.common.CategoryData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListCategoriesData {
	
	private List<CategoryData> categories;

}
