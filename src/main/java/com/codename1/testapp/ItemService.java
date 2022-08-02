package com.codename1.testapp;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemService {
    
    @Autowired
    private ItemRepository repo;
    
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Item[] go(@RequestParam(value="id", required=false) Long id,
            @RequestParam(value="owner", required=false) String owner) {
        if(id != null) {
            Item c = repo.findOne(id);
            return new Item[] {c};
        }
        if(owner != null) {
            List<Item> c = repo.findByOwner(owner);
            Item[] i = new Item[c.size()];
            return c.toArray(i);
        }
        
        return new Item[0];
    }

    @RequestMapping(method=RequestMethod.PUT)
    public @ResponseBody Item add(@RequestBody(required=true) Item i) {
        i = repo.save(i);
        return i;
    }   
}