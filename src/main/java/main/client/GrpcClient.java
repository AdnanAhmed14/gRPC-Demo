package main.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import student.poc.grpc.Address;
import student.poc.grpc.StudentRequest;
import student.poc.grpc.StudentResponse;
import student.poc.grpc.StudentServiceGrpc;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        StudentServiceGrpc.StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(channel);
        StudentResponse response = stub.addStudent(StudentRequest.newBuilder()
                .setFirstName("Adnan")
                .setLastName("Ahmed")
                .setRoleNumber(10245)
                .addAddress(Address.newBuilder().setState("Patna")
                        .setDistrict("Bihar")
                        .setPin(801505).build())
                .build());

        System.out.println("Response received from server:\n" + response );

        channel.shutdown();
    }
}
