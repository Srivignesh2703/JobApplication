package com.vignesh.spring_boot_rest;

import com.vignesh.spring_boot_rest.model.JobPost;
import com.vignesh.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping(path="/jobPosts", produces = {"application/json"})
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId){
        return service.getJobById(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        System.out.println("Adding Job");
        service.addJob(jobPost);
        return service.getJobById(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        return service.updateJob(jobPost);
    }

    @DeleteMapping("jobPost/{jobId}")
    public void deleteJob(@PathVariable("jobId") int id){
        service.deleteJob(id);
    }

    @RequestMapping("/load")
    public String load(){
        service.load();
        return "Data Added";
    }

    @GetMapping("jobPosts/search/{keyword}")
    public List<JobPost> findByKeyword(@PathVariable("keyword") String keyword){
        System.out.println("Searching: " + keyword);
        return service.findByKeyword(keyword);
    }
}
