package boot.crud.services;

import boot.crud.entity.Student;
import boot.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }
}
