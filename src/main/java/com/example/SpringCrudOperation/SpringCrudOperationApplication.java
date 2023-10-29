package com.example.SpringCrudOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringCrudOperationApplication implements CommandLineRunner {
@Autowired
private Stud_repository studRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringCrudOperationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student=new Student();
		student.setId(111);
		student.setCity("Mumbai");
		student.setName("Alice");
		Student student1=new Student();
		student1.setId(222);
		student1.setCity("Hyderabad");
		student1.setName("Maggie");
		Student student2=new Student();
		student2.setId(333);
		student2.setCity("Chennai");
		student2.setName("Noah");
		Student student3=new Student();
		student3.setId(444);
		student3.setCity("Bhubaneswar");
		student3.setName("Nick");
		List<Student>li=List.of(student,student1,student2,student3);
		studRepository.saveAll(li);
	}
}
