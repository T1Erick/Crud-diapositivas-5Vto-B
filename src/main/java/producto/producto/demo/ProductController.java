package producto.producto.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin({"*"})

public class ProductController {
    @Autowired 
    private ProductService productService;

    @PostMapping("/")

    public Product save(@RequestBody Product entity)
    {
        return productService.save(entity);
    }

    @GetMapping("/{id}/")
    public Product findProduct(@PathVariable long id)
    {
        return productService.findById(id);
    }
    @PutMapping("/")
    public Product update(@RequestBody Product entity)
    {
        return productService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteByID(@PathVariable long id)
    {
        productService.deleteByID(id);
    }

    @GetMapping("/")
    public List<Product> findAll()
    {
        return productService.findAll();
    }
}
