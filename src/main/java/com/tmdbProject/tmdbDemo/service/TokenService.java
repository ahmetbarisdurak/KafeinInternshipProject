package com.tmdbProject.tmdbDemo.service;

import com.tmdbProject.tmdbDemo.entity.Token;


public interface TokenService {

    Token findByToken(String token);

    Token findById(int id);
    void save(int theId, String theToken);

    int deleteByToken(String theToken);
}
