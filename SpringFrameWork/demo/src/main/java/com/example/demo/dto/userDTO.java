package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class userDTO {

    @NotNull
    @NotBlank
    private String name;

    @Min(value = 100_00_00_00_0L,message = "WRONG NUMBER DUDE!!!")
    @Max(value = 999_99_99_99_9L,message = "WRONG NUMBER DUDE!!!")
    private Long mobileNumber;

    @Email(message = "WRONG EMAIL")
    private String email;

}
