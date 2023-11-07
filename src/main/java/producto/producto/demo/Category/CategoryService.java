package producto.producto.demo.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //create
    public Category save(Category entity)
    {
        return categoryRepository.save(entity);
    }

    //read
    public Category findById(long id)
    {
        return categoryRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteByID (long id)
    {
        categoryRepository.deleteById(id);
    }
    //
    
    //select all
    public List <Category> findAll()
    {
        return categoryRepository.findAll();
    }
    
}
