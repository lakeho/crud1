package boot.crud.controller;

import boot.crud.entity.Student;
import boot.crud.repository.StudentRepository;
import boot.crud.services.StudentService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/student")
public class MainController {

//    private String prefix = "redirect:/student/";
    @Autowired
    StudentRepository StudentRepo;

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/init")
    public String init(){
        return "init";
    }

    @RequestMapping(value = "/listStudent", method = RequestMethod.GET)
    public List<Student> list(){
        List<Student> list = (List<Student>) StudentRepo.findAll();
//        model.addAttribute("StudentList",list);
        return list;
    }

    @GetMapping(value = "/list/{id}")
    public String detail(@PathVariable("id") Long id, Model model){
        Student std = StudentRepo.findById(id).get();
        model.addAttribute("Student",std);
        return "detail";
    }

    @PostMapping(value = "/list/{id}")
    public String update(@ModelAttribute("Student") Student std){
        StudentRepo.save(std);
        return "redirect:/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String update(@PathVariable("id") Long id, Model model){
        StudentRepo.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping(value = "/add")
    public String addPage(Model model){
        model.addAttribute("NewStudent", new Student());
        return "add";
    }

    @PostMapping(value = "add")
    public String add(@ModelAttribute("NewStudent") Student std){
        StudentRepo.save(std);
        return "redirect:/list";
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }


}
