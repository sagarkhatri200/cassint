package com.sagar.cassandra.cass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@RestController
public class CassController {
    @Autowired
    CassRepository cassRepository;

    @GetMapping("SaveAll")
    public void SaveAll(){
        List<Restaurant> restaurantList= new LinkedList<>();
        restaurantList.add(new Restaurant(UUID.randomUUID(),"Coll 1","Irving",12,true));
        restaurantList.add(new Restaurant(UUID.randomUUID(),"Coll 2","Dallas",14,false));
        restaurantList.add(new Restaurant(UUID.randomUUID(),"Coll 3","Mesquite",15,true));
        cassRepository.saveAll(restaurantList);
    }
}
