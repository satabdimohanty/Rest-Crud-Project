package com.example.SpringCrudOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/controller")
public class Controller {
    @Autowired
    private Student student;
    @Autowired
    private  Stud_repository studRepository;

    @GetMapping("/getStudent")
    List<Student>getStudent()
    {
       return studRepository.findAll();
    }
    @PostMapping("/getStud")
    public Student getstud(@RequestBody  Student student)
    {
      return studRepository.save(student)  ;
    }
    @GetMapping ("/entity/{id}")
    public ResponseEntity<Student>getstudentity( @PathVariable int id)
    {
        Student student11=studRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFound("this id is not present" +id));

return ResponseEntity.ok(student11);

    }
    @PutMapping("/updateStud/{id}")
    public ResponseEntity<Student>updateStud(@PathVariable int id,@RequestBody Student student)
    {
        Student updateStud=studRepository.findById(id).orElseThrow(()-> new ResourceNotFound("this id is not present" +id));
        updateStud.setName(student.getName());
        updateStud.setCity(student.getCity());
        studRepository.save(updateStud);
        return ResponseEntity.ok(updateStud);
    }
}
