package com.yeosg1.Task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.yeosg1.Task.dto.request.PostRequestBodyDto;

@RestController
@RequestMapping("/api/v1")



public class MainController {

    @GetMapping("task/{taskNumber}")
    public String getSchedule(@PathVariable("taskNumber")String taskNumber){
        return "일정 불러오기";
    }

    @PostMapping("task")
    public String postSchedule(@RequestBody PostRequestBodyDto bodyDto){
        return "일정 작성하기" + bodyDto.getScheduleName() + bodyDto.getCategory() + bodyDto.getDescription() + bodyDto.getDate() + bodyDto.getTime();
    }

    @PatchMapping("task/{taskNumber}")
    public String patchSchedule(@RequestBody PostRequestBodyDto bodyDto){
         return "일정 수정하기" + bodyDto.getScheduleName() + bodyDto.getCategory() + bodyDto.getDescription() + bodyDto.getDate() + bodyDto.getTime();
    }

    @DeleteMapping("task/{taskNumber}")
    public String deleteSchedule(){
        return "삭제합니다.";
    }
}



