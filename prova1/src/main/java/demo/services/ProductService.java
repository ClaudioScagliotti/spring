package demo.services;


import demo.beans.MyBeanInterface;
import demo.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final MyBeanInterface myBean;
    public ProductService(ProductRepository repository, MyBeanInterface myBean) {
        this.repository = repository;
        this.myBean = myBean;
    }
    public void addProduct(){
        repository.add();
        System.out.println("Service");
        myBean.hello();
    }
}
