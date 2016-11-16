package com.theironyard.controllers;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import com.theironyard.services.LecturerRepository;
import com.theironyard.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VeryBarry on 10/26/16.
 */
@RestController
public interface HannibalLecturerRestController extends CrudRepository<Lecturer, Integer> {

        @Autowired
        LecturerRepository lecturers = null;

        @Autowired
        ReviewRepository reviews = null;


}