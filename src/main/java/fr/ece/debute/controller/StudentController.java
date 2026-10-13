package fr.ece.debute.controller;

import fr.ece.debute.entity.Student;
import fr.ece.debute.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(@RequestParam UUID id){
        return studentRepository.findById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
	return studentRepository.save(student);
}

}
