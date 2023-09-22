package com.mamun.employeeservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
