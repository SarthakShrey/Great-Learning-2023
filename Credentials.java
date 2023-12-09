package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.services.Employee;

public class CredentialService {
	
	private String capitalLetters;
	private String generatedPassword;
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "012345789";
		String specialCharacters = "!@#$%^&*_+=-/.,?><)'";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		String generatedEmail = firstName + lastName + "@" + department + ".ashtasiddhi.com";
		return generatedEmail;
		
	}
	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		
		System.out.println("Hi" + employee.getFirstName() + "your generated credentials are as follows");
		System.out.println("Email is" + email );
		System.out.println("password is" + generatedPassword);
	}
}
