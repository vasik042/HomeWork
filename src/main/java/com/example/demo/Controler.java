package com.example.demo;


import com.example.demo.Entity.Student;
import com.example.demo.Entity.StudentRequest;

import com.example.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class Controler {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String allStudents(HttpServletRequest req) {
        req.setAttribute("students", studentService.getAll());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getCreate() {
        return "create";
    }

    @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    public String getCabinet() {
        return "create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createStudent(@ModelAttribute StudentRequest studentRequest, HttpServletRequest req, @RequestParam("photo") MultipartFile file) {
        Student save = studentService.save(studentRequest, file);
        req.setAttribute("student", save);
        return "cabinet";
    }

    @GetMapping("/download/{studentId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String studentId) {
        Student student = studentService.getStudent(Integer.parseInt(studentId));
        return ResponseEntity.ok()
         .contentType(MediaType.parseMediaType(student.getFileType()))
         .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + student.getFileName())
         .body(new ByteArrayResource(student.getData()));
  }

}
