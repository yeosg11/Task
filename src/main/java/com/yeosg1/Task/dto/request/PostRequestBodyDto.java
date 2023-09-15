package com.yeosg1.Task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestBodyDto {
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
}
