package src.com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Student;
import com.app.repo.StudentRepo;


@SpringBootApplication
public class SBtwoApplication implements CommandLineRunner{

	@Autowired
	private StudentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(SBtwoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Student s1= new Student("josh","delhi", "jo@gmail.com");
		Student s2= new Student("mon","canada", "m@gmail.com");
		Student s3= new Student("deepak","mumbai", "dee@gmail.com");
		Student s4= new Student("veda","goa", "veda@gmail.com");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		
		
	}

}
