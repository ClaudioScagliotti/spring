package demo.services;

import demo.beans.ManagedBean;
import demo.beans.NamedBean;
import demo.components.ExempleComponent;
import demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class InjectService {

    // tre modi alternativi per fare iniezione delle dipendenze con notation
    @Resource(name = "exempleComponent")
    private ExempleComponent component;

    @Inject
    private ProductRepository repository;

    @Autowired
    private ProductService service;


    // injection di classi in cui al posto di component viene usato @NamedBean e @ManagedBeam di JSR 330
    @Autowired
    private NamedBean named;

    @Autowired
    private ManagedBean managed;
    public void prova(){
        repository.add();
       component.exempleMethod();
       service.addProduct();
       named.saluto();
       managed.saluto();
    }
}
