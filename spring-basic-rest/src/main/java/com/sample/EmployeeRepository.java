package com.sample;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {
}

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}