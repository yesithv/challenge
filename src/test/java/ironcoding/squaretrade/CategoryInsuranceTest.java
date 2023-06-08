package ironcoding.squaretrade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryInsuranceTest {

    @Test
    public void validateGetData_ifDataExist() {
        var data = CategoryInsurance.fullData();
        assertNotNull(data);
    }

    @Test
    public void search_without_result() {
        var categoryList = CategoryInsurance.fullData();
        var categoryName = "Lorem ipsun";
        var data = CategoryInsurance.findByCategoryName(categoryList, categoryName);
        assertTrue(data.isEmpty());
    }

    @Test
    public void search_with_response() {
        var categoryList = CategoryInsurance.fullData();
        var categoryName = "Electronics";
        var data = CategoryInsurance.findByCategoryName(categoryList, categoryName);
        assertFalse(data.isEmpty());
    }
}