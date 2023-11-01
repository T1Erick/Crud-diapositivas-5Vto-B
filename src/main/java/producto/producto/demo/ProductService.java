package producto.producto.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
    @Autowired
    private ProductRepository productRepository;

    //create
    public Product save(Product entity)
    {
        return productRepository.save(entity);
    }

    //read
    public Product findById(long id)
    {
        return productRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteByID (long id)
    {
        productRepository.deleteById(id);
    }
    //
    
    //select all
    public List <Product> findAll()
    {
        return productRepository.findAll();
    }
}
