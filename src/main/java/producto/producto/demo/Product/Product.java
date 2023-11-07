package producto.producto.demo.Product;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import producto.producto.demo.Category.Category;
@Data
@Entity
public class Product
{   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String productName;
    private String productDescription;
    private long price;
    //relaciones
    @ManyToOne
    private Category category; 
}
