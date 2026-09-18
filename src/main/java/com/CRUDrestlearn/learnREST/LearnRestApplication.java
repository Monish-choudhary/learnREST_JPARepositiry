package com.CRUDrestlearn.learnREST;

import com.CRUDrestlearn.learnREST.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnRestApplication {

	public static void main(String[] args) {
        Emp1 emp = () -> "Monish";
        System.out.println(emp.getName());

        Emp1 emp2 = () -> "editor";
        System.out.println(emp2.getName());
        // Runnable is an interface, it worked because it is functional interface having single
        // method and we used lambda fxn to write implementation of it's single run method
        Runnable runn = () -> {
            for(int i=0; i<5; i++) {
                System.out.println("hello" + i);
            }
        };

        runn.run();
        SpringApplication.run(LearnRestApplication.class, args);
	}

}
