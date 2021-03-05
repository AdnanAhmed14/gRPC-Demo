// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package student.poc.grpc;

public interface StudentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:student.poc.grpc.StudentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string firstName = 1;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string firstName = 1;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string lastName = 2;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string lastName = 2;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>int32 roleNumber = 3;</code>
   * @return The roleNumber.
   */
  int getRoleNumber();

  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  java.util.List<student.poc.grpc.Address> 
      getAddressList();
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  student.poc.grpc.Address getAddress(int index);
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  int getAddressCount();
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  java.util.List<? extends student.poc.grpc.AddressOrBuilder> 
      getAddressOrBuilderList();
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  student.poc.grpc.AddressOrBuilder getAddressOrBuilder(
      int index);
}
