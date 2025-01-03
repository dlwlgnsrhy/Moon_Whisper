//package com.app.alpha.service;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
//import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
//import software.amazon.awssdk.core.ResponseInputStream;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.s3.S3Client;
//import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
//import software.amazon.awssdk.services.s3.model.GetObjectRequest;
//import software.amazon.awssdk.services.s3.model.GetObjectResponse;
//import software.amazon.awssdk.services.s3.model.PutObjectRequest;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.UUID;
//
//@Service
//public class S3Service {
//
//    private final S3Client s3Client;
//    private final String bucketName;
//
//    public S3Service(
//            @Value("${aws.s3.bucket.name}") String bucketName,
//            @Value("${aws.s3.region}") String region,
//            @Value("${aws.access.key}") String accessKey,
//            @Value("${aws.secret.key}") String secretKey) {
//        this.bucketName = bucketName;
//
//        AwsBasicCredentials awsCredentials = AwsBasicCredentials.create(accessKey, secretKey);
//        this.s3Client = S3Client.builder()
//                .region(Region.of(region))
//                .credentialsProvider(StaticCredentialsProvider.create(awsCredentials))
//                .build();
//    }
//
//    // 파일 업로드
//    public String uploadFile(File file) throws IOException {
//        String fileName = UUID.randomUUID() + "_" + file.getName();
//
//        s3Client.putObject(
//                PutObjectRequest.builder()
//                        .bucket(bucketName)
//                        .key(fileName)
//                        .acl("public-read") // 파일을 공개 상태로 설정
//                        .build(),
//                software.amazon.awssdk.core.sync.RequestBody.fromBytes(Files.readAllBytes(file.toPath()))
//        );
//
//        return fileName;
//    }
//
      // // 파일 업데이트
      // public String updateFile(File file) throws IOException {
      //   String fileName = UUID.randomUUID() + "_" + file.getName();

      //   s3Client.putObject(
      //     PutObjectRequest.builder()
      //             .bucket(buckerName)
      //             .key(fileName)
      //             .acl("public-read")
      //             .build(),
      //     software.amazon.awssdk.core.sync.RequestBody.fromBytes(Files.readAllBytes(file.toPath()))
      //     );
      //   return fileName;
      // }
//    // 파일 다운로드
//    public byte[] downloadFile(String fileName) throws IOException {
//        // S3에서 객체 가져오기
//        try (ResponseInputStream<GetObjectResponse> objectResponse = s3Client.getObject(
//                GetObjectRequest.builder()
//                        .bucket(bucketName)
//                        .key(fileName)
//                        .build()
//        )) {
//            // 스트림에서 데이터를 읽어 바이트 배열로 반환
//            return objectResponse.readAllBytes();
//        }
//    }
//
//    // 파일 삭제
//    public void deleteFile(String fileName) {
//        s3Client.deleteObject(DeleteObjectRequest.builder()
//                .bucket(bucketName)
//                .key(fileName)
//                .build());
//    }
//}
