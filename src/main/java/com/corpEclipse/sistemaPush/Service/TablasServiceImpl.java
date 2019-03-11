/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.Service;

import com.corpEclipse.sistemaPush.DAO.TablasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author deivi
 */
@Service
public class TablasServiceImpl implements TablasService{
    
    @Autowired
    private TablasDAO tablasDao;
    
}
