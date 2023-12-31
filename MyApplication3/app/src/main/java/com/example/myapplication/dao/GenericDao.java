package com.example.myapplication.dao;

import java.util.ArrayList;

public interface GenericDao <Object>{
    long insert(Object obj);
    long update(Object obj);
    long delete(Object obj);

    ArrayList<Object> getaAll();

    Object getById(int id);

}
