package com.vignesh.spring_boot_rest.service;


import com.vignesh.spring_boot_rest.model.JobPost;
import com.vignesh.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost job){
        repo.save(job);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJobById(int id){
        return repo.findById(id).orElse(new JobPost());
    }

    public JobPost updateJob(JobPost jobPost){
        return repo.save(jobPost);
    }

    public void deleteJob(int id){
        repo.deleteById(id);
    }

    public void load(){
        List<JobPost> jobs = new ArrayList<>(List.of(
                new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
                new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
                new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
                new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))
                ));
        repo.saveAll(jobs);
        System.out.println("Successfully Added");

    }

    public List<JobPost> findByKeyword(String keyword){
        List<JobPost> result = repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
        System.out.println(result);
        return result;
    }
}
