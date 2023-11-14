package com.abhinav.fileuploaddownload.repository;

import com.abhinav.fileuploaddownload.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository  extends JpaRepository<Attachment,String> {
}
