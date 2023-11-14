package com.abhinav.fileuploaddownload.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDataDto {

    private String fileName;
    private String downloadURL;
    private String fileType;
    private long fileSize;
}