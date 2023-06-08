package ironcoding.squaretrade.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Category {

    private String level;
    private String name;
    private List<String> keywords;

}
