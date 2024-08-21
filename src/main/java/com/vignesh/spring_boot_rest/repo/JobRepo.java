package com.vignesh.spring_boot_rest.repo;

import com.vignesh.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    public List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}

//// arrayList to store store JobPost objects
//List<JobPost> jobs = new ArrayList<>();
//
//// ****************************************************************************
//
//// constructor->injecting objects into ArrayList defined above.
//public JobRepo() {
//
//    // Java Developer Job Post
//    jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//            List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//    // Frontend Developer Job Post
//    jobs.add(
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                    3, List.of("HTML", "CSS", "JavaScript", "React")));
//
//    // Data Scientist Job Post
//    jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//            List.of("Python", "Machine Learning", "Data Analysis")));
//
//    // Network Engineer Job Post
//    jobs.add(new JobPost(4, "Network Engineer",
//            "Design and implement computer networks for efficient data communication", 5,
//            List.of("Networking", "Cisco", "Routing", "Switching")));
//
//    // Mobile App Developer Job Post
//    jobs
//            .add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
//                    3, List.of("iOS Development", "Android Development", "Mobile App")));
//
//    // DevOps Engineer Job Post
//    jobs.add(
//            new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
//                    4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));
//
//    // UI/UX Designer Job Post
//    jobs
//            .add(new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces",
//                    2, List.of("User Experience", "User Interface Design", "Prototyping")));
//
//    // Cybersecurity Analyst Job Post
//    jobs
//            .add(new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats",
//                    4, List.of("Cybersecurity", "Network Security", "Incident Response")));
//
//    // Full Stack Developer Job Post
//    jobs.add(new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development",
//            5, List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")));
//
//    // Cloud Architect Job Post
//    jobs.add(new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6,
//            List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")));
//
//    // Job Post 11
//    jobs.add(new JobPost(11, "Software Tester", "Ensure software quality through testing and validation", 3,
//            List.of("Testing", "JUnit", "Selenium", "TestNG")));
//
//    // Job Post 12
//    jobs.add(new JobPost(12, "React Native Developer",
//            "Develop cross-platform mobile applications using React Native", 2,
//            List.of("React Native", "JavaScript", "Mobile App Development")));
//
//    // Job Post 13
//    jobs.add(new JobPost(13, "Business Analyst", "Analyze business processes and recommend improvements", 4,
//            List.of("Business Analysis", "Requirements Gathering", "Process Modeling")));
//
//    // Job Post 14
//    jobs.add(new JobPost(14, "Embedded Systems Engineer",
//            "Design and develop embedded systems for hardware applications", 5,
//            List.of("Embedded Systems", "C/C++", "Microcontrollers", "RTOS")));
//
//    // Job Post 15
//    jobs.add(new JobPost(15, "Content Writer",
//            "Create engaging and informative content for websites and publications", 2,
//            List.of("Content Writing", "Copywriting", "SEO", "Creative Writing")));
//}
//
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJobById(int id){
//    for(JobPost job: jobs){
//        if(job.getPostId() == id){
//            return job;
//        }
//    }
//    return null;
//}
//
//public JobPost updateJob(JobPost jobPost){
////        JobPost temp = getJobById(jobPost.getPostId());
////        temp = jobPost;
////        return temp;
//    for(JobPost j: jobs){
//        if(j.getPostId() == jobPost.getPostId()){
////                j = jobPost;
//            j.setPostId(jobPost.getPostId());
//            j.setPostDesc(jobPost.getPostDesc());
//            j.setPostProfile(jobPost.getPostProfile());
//            j.setReqExperience(jobPost.getReqExperience());
//            j.setPostTechStack(jobPost.getPostTechStack());
//            return j;
//        }
//    }
//    return null;
//}
//
//public String deleteJob(int jobId){
////        for(JobPost j: jobs){
////            if(j.getPostId() == jobId){
////                jobs.remove(j);
////                return "Deleted";
////            }
////        }
////        return "Job Not Found!";
//    if(jobs.remove(getJobById(jobId))){
//        return "Deleted";
//    }
//    return "Job Not Found";
//}