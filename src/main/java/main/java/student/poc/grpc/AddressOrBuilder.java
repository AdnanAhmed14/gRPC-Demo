// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package student.poc.grpc;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:student.poc.grpc.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string state = 1;</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <code>string state = 1;</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>string district = 2;</code>
   * @return The district.
   */
  java.lang.String getDistrict();
  /**
   * <code>string district = 2;</code>
   * @return The bytes for district.
   */
  com.google.protobuf.ByteString
      getDistrictBytes();

  /**
   * <code>int32 pin = 3;</code>
   * @return The pin.
   */
  int getPin();
}
