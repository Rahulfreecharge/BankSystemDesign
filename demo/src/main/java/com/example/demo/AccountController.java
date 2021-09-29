package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {
@GetMapping("/")
void getAccounts() {
System.out.println("called");
}
@GetMapping("/{id}")
void getAccount(@PathVariable Integer id) {
System.out.println("called"+id);
}
@PostMapping
String postAccount(@RequestBody abc account) {
System.out.println("called");
System.out.println("Name : " + account.getName());
System.out.println("Account Number: "+account.getAccNo());
System.out.println("Address : "+account.getAddress());
System.out.println("Available Balance : "+account.getBalance());
System.out.println("Date of Creation : " + account.getDate());
System.out.println("Account Status : "+account.getStatus());
return "Account details displayed";
}
}