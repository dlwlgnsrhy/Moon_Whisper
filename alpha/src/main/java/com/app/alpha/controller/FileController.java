//package com.app.alpha.controller;
//
//import com.app.alpha.service.S3Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//
//@RestController
//@RequestMapping("/files")
//public class FileController {
//
//    @Autowired
//    private S3Service s3Service;
//
//    // 파일 업로드
//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
//        File tempFile = File.createTempFile("temp", file.getOriginalFilename());
//        file.transferTo(tempFile);
//
//        String fileName = s3Service.uploadFile(tempFile);
//        tempFile.delete();
//        return ResponseEntity.ok("File uploaded: " + fileName);
//    }

     // // 파일 업데이트
     //  @PostMapping("/update{filename}")
     //    public ResponseEntity<String> updateFile(@RequestParma("file") MultipartFile file) throws IOException {
     //    File tempFile = File.createTempFile("temp", file.getOriginalFilename());
     //    file.transferTo(tempFile);

     //    String fileName = s3Service.updateFile(tempFile);
     //    tempFile.delete();
     //    return ResponseEntity.ok("File uploaded: " + fileName);
     //  }
//
//    // 파일 다운로드
//    @GetMapping("/download/{fileName}")
//    public ResponseEntity<byte[]> downloadFile(@PathVariable String fileName) {
//        byte[] fileData = s3Service.downloadFile(fileName);
//        return ResponseEntity.ok(fileData);
//    }
//
//    // 파일 삭제
//    @DeleteMapping("/delete/{fileName}")
//    public ResponseEntity<String> deleteFile(@PathVariable String fileName) {
//        s3Service.deleteFile(fileName);
//        return ResponseEntity.ok("File deleted: " + fileName);
//    }
//}
