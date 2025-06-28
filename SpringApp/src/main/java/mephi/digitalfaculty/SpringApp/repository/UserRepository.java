package mephi.digitalfaculty.SpringApp.repository;


import mephi.digitalfaculty.SpringApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
