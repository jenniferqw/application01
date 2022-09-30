package com.example.springboot;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

	@Autowired
	
	public class AutomorphicNumberExample1  
{   
//user-defined static method that checks whether the number is automorphic or not   
static boolean isAutomorphic(int num)   
{   
//determines the square of the specified number  
int square = num * num;   
//comparing the digits until the number becomes 0  
while (num > 0)   
{   
//find the remainder (last digit) of the variable num and square and comparing them  
if (num % 10 != square % 10)   
//returns false if digits are not equal  
return false;   
//reduce num and square by dividing them by 10  
num = num/10;   
square = square/10;   
}   
return true;   
}   
//Driver code  
public static void main(String args[])   
{   
//number to be check      
//calling the method and prints the result accordingly  
System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");   
}   
}  
Output 1:
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Greetings from Spring Boot!")));
	}
}
