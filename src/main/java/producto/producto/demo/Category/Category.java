package producto.producto.demo.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Category
{   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idCategory;
    private String categoryName;
    private String categoryDescription;

    
    
}

    

