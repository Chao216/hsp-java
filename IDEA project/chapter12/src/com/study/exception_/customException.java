package com.study.exception_;

public class customException {
    public static void main(String[] args) {
        char gender1 = 'f';
        if (!(gender1=='f'||gender1=='m')){
            throw new genderException("gender must be either m or f");
        }
        System.out.println("gender input is valid");

        int age = 10;
        if(!(age> 0 && age < 120)){
            throw new ageException("age range 0,120");
        }
        System.out.println("age is valid!");



    }
}
// normal when create custom exception, we extends runtimeexception
class genderException extends RuntimeException{
    public genderException(String message) {// this is a constructor
        super(message);
    }
}

class ageException extends RuntimeException{
    public ageException(String message) {
        super(message);
    }
}