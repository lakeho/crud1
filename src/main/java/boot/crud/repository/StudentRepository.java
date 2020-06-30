package boot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import boot.crud.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

}
