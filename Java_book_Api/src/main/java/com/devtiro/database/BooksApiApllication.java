package com.devtiro.database;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BooksApiApllication  {

    public static void main(String[] args) {
        SpringApplication.run(BooksApiApllication.class, args);
    }
}
