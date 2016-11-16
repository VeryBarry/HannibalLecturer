package com.theironyard.controllers;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import com.theironyard.services.LecturerRepository;
import com.theironyard.services.ReviewRepository;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.ws.Service;
import java.sql.SQLException;

/**
 * Created by VeryBarry on 10/26/16.
 */
@Controller
public class HannibalLecturerController {
    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    Server h2Server;

    @PostConstruct
    public void init () throws SQLException {
        h2Server = Server.createWebServer().start();
    }

    @PreDestroy
    public void destroy(){
        h2Server.stop();
    }

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public String createLecturer(String name, String topic, String image) {
        Lecturer lecturer = new Lecturer(name, topic, image);
        lecturers.save(lecturer);
        return "index";
    }
    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public Iterable<Lecturer> getLectures () {
        return lecturers.findAll();
    }
    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public String createReview(String author, String text, boolean bool) {
        Review review = new Review (author, text, bool);
        reviews.save(review);
        return "index";
    }
    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public Iterable<Review> getReviews () {
        return reviews.findAll();
    }
}