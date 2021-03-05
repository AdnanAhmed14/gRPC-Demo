package main.server;

import io.grpc.stub.StreamObserver;
import student.poc.grpc.StudentRequest;
import student.poc.grpc.StudentResponse;
import student.poc.grpc.StudentServiceGrpc;

public class AddStudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {
    @Override
    public void addStudent(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        String studentDetails = new StringBuilder()
                .append("Student details: ")
                .append(", First name: " +request.getFirstName() )
                .append(", Last name: " +request.getLastName())
                .append(", Role number: " +request.getRoleNumber())
                .append(", Address" +request.getAddressList())
                .toString();
        StudentResponse response = StudentResponse.newBuilder()
                .setStudentDetails(studentDetails)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
