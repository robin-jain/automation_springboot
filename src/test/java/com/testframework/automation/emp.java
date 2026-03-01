package com.testframework.automation;

public class emp {
    Employee e = Employee.builder()
            .id(1L)
            .name("Robin")
            .department("QA")
            .build();

}
//
//Lombok + JPA entity example
//
//        Lombok + REST DTO example
//
//        Lombok + Controller/Service example
//
//        When not to use @Data
//
//Real-world Lombok best practices
//Builder vs Constructor
//
//        Builder vs Factory
//
//        Builder + Lombok vs Manual Builder
//
//        Performance impact
//
//        Real-world Spring Boot use cases
//Use Builder for DTOs, API requests, config objects
//
//        Use Constructors for simple entities and JPA (often required)