package com.example.demo.controller;

import org.springframework.http.HttpStatus;

public @interface RespponseStatus {

	HttpStatus code();

}
