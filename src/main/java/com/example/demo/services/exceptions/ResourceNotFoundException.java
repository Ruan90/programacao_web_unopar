package com.example.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Recurso não encontrado!");
	}
}
