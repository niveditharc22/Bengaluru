package src.com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.entity.Home;
import com.app.entity.doctype;
import com.app.entity.html;
import com.app.entity.link;
import com.app.entity.meta;
import com.app.entity.script;
import com.app.entity.th;
import com.app.entity.tr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="studentso")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	
	private int id;
	private String name;
	private String address;
	private String email;
	
	public Student() {}
	
	public Student(String name, String address, String email) {
		super();	
		this.name = name;
		this.address = address;
		this.email = email;
		
		
	}

}


<tr th:each="student: ${studentlist}">
<th th:text="${student.id}" scope="row"></th>
<td th:text="${student.name}"></td>
<td th:text="${student.address}"></td>
<td th:text="${student.email}" ></td>



<!doctype html>
<html lang="en" xmlns:th="https://www.thymeleaf.org">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

<title> Home Page</title>
</head>
<body>
	<div class="container">
		<table class="table">
  <thead>
    <tr>
      <th scope="col">StudentId</th>
      <th scope="col">Name</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"></th>
      <td></td>
      <td></td>
      <td></td>
    </tr>
   
  </tbody>
</table>


	</div>
	

</body>
</html>

