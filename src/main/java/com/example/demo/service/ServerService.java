package com.example.demo.service;

import com.example.demo.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Collection<Server> List(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
    
}
