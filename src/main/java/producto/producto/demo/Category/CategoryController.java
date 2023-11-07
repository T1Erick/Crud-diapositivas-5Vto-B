package producto.producto.demo.Category;

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
@RequestMapping("/crud")
@CrossOrigin({"*"})

public class CategoryController {
    @Autowired 
    private CategoryService categoryService;

    @PostMapping("/category")

    public Category save(@RequestBody Category entity)
    {
        return categoryService.save(entity);
    }

    @GetMapping("/category/{id}/")
    public Category findCategory(@PathVariable long id)
    {
        return categoryService.findById(id);
    }
    @PutMapping("/category/{id}/")
    public Category update(@RequestBody Category entity)
    {
        return categoryService.save(entity);
    }

    @DeleteMapping("/category/{id}/")
    public void deleteByID(@PathVariable long id)
    {
        categoryService.deleteByID(id);
    }

    @GetMapping("/category")
    public List<Category> findAll()
    {
        return categoryService.findAll();
    }
}
