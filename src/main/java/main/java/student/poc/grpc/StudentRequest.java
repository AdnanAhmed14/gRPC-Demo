// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package student.poc.grpc;

/**
 * Protobuf type {@code student.poc.grpc.StudentRequest}
 */
public final class StudentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:student.poc.grpc.StudentRequest)
    StudentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentRequest.newBuilder() to construct.
  private StudentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentRequest() {
    firstName_ = "";
    lastName_ = "";
    address_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            firstName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lastName_ = s;
            break;
          }
          case 24: {

            roleNumber_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              address_ = new java.util.ArrayList<student.poc.grpc.Address>();
              mutable_bitField0_ |= 0x00000001;
            }
            address_.add(
                input.readMessage(student.poc.grpc.Address.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        address_ = java.util.Collections.unmodifiableList(address_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return student.poc.grpc.StudentServiceOuterClass.internal_static_student_poc_grpc_StudentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return student.poc.grpc.StudentServiceOuterClass.internal_static_student_poc_grpc_StudentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            student.poc.grpc.StudentRequest.class, student.poc.grpc.StudentRequest.Builder.class);
  }

  public static final int FIRSTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object firstName_;
  /**
   * <code>string firstName = 1;</code>
   * @return The firstName.
   */
  @java.lang.Override
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }
  /**
   * <code>string firstName = 1;</code>
   * @return The bytes for firstName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LASTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object lastName_;
  /**
   * <code>string lastName = 2;</code>
   * @return The lastName.
   */
  @java.lang.Override
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }
  /**
   * <code>string lastName = 2;</code>
   * @return The bytes for lastName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLENUMBER_FIELD_NUMBER = 3;
  private int roleNumber_;
  /**
   * <code>int32 roleNumber = 3;</code>
   * @return The roleNumber.
   */
  @java.lang.Override
  public int getRoleNumber() {
    return roleNumber_;
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  private java.util.List<student.poc.grpc.Address> address_;
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  @java.lang.Override
  public java.util.List<student.poc.grpc.Address> getAddressList() {
    return address_;
  }
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends student.poc.grpc.AddressOrBuilder> 
      getAddressOrBuilderList() {
    return address_;
  }
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  @java.lang.Override
  public int getAddressCount() {
    return address_.size();
  }
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  @java.lang.Override
  public student.poc.grpc.Address getAddress(int index) {
    return address_.get(index);
  }
  /**
   * <code>repeated .student.poc.grpc.Address address = 4;</code>
   */
  @java.lang.Override
  public student.poc.grpc.AddressOrBuilder getAddressOrBuilder(
      int index) {
    return address_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lastName_);
    }
    if (roleNumber_ != 0) {
      output.writeInt32(3, roleNumber_);
    }
    for (int i = 0; i < address_.size(); i++) {
      output.writeMessage(4, address_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lastName_);
    }
    if (roleNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, roleNumber_);
    }
    for (int i = 0; i < address_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, address_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof student.poc.grpc.StudentRequest)) {
      return super.equals(obj);
    }
    student.poc.grpc.StudentRequest other = (student.poc.grpc.StudentRequest) obj;

    if (!getFirstName()
        .equals(other.getFirstName())) return false;
    if (!getLastName()
        .equals(other.getLastName())) return false;
    if (getRoleNumber()
        != other.getRoleNumber()) return false;
    if (!getAddressList()
        .equals(other.getAddressList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    hash = (37 * hash) + ROLENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getRoleNumber();
    if (getAddressCount() > 0) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddressList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static student.poc.grpc.StudentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static student.poc.grpc.StudentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static student.poc.grpc.StudentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static student.poc.grpc.StudentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static student.poc.grpc.StudentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static student.poc.grpc.StudentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(student.poc.grpc.StudentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code student.poc.grpc.StudentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:student.poc.grpc.StudentRequest)
      student.poc.grpc.StudentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return student.poc.grpc.StudentServiceOuterClass.internal_static_student_poc_grpc_StudentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return student.poc.grpc.StudentServiceOuterClass.internal_static_student_poc_grpc_StudentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              student.poc.grpc.StudentRequest.class, student.poc.grpc.StudentRequest.Builder.class);
    }

    // Construct using student.poc.grpc.StudentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAddressFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstName_ = "";

      lastName_ = "";

      roleNumber_ = 0;

      if (addressBuilder_ == null) {
        address_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        addressBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return student.poc.grpc.StudentServiceOuterClass.internal_static_student_poc_grpc_StudentRequest_descriptor;
    }

    @java.lang.Override
    public student.poc.grpc.StudentRequest getDefaultInstanceForType() {
      return student.poc.grpc.StudentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public student.poc.grpc.StudentRequest build() {
      student.poc.grpc.StudentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public student.poc.grpc.StudentRequest buildPartial() {
      student.poc.grpc.StudentRequest result = new student.poc.grpc.StudentRequest(this);
      int from_bitField0_ = bitField0_;
      result.firstName_ = firstName_;
      result.lastName_ = lastName_;
      result.roleNumber_ = roleNumber_;
      if (addressBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          address_ = java.util.Collections.unmodifiableList(address_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof student.poc.grpc.StudentRequest) {
        return mergeFrom((student.poc.grpc.StudentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(student.poc.grpc.StudentRequest other) {
      if (other == student.poc.grpc.StudentRequest.getDefaultInstance()) return this;
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
        onChanged();
      }
      if (other.getRoleNumber() != 0) {
        setRoleNumber(other.getRoleNumber());
      }
      if (addressBuilder_ == null) {
        if (!other.address_.isEmpty()) {
          if (address_.isEmpty()) {
            address_ = other.address_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAddressIsMutable();
            address_.addAll(other.address_);
          }
          onChanged();
        }
      } else {
        if (!other.address_.isEmpty()) {
          if (addressBuilder_.isEmpty()) {
            addressBuilder_.dispose();
            addressBuilder_ = null;
            address_ = other.address_;
            bitField0_ = (bitField0_ & ~0x00000001);
            addressBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAddressFieldBuilder() : null;
          } else {
            addressBuilder_.addAllMessages(other.address_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      student.poc.grpc.StudentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (student.poc.grpc.StudentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object firstName_ = "";
    /**
     * <code>string firstName = 1;</code>
     * @return The firstName.
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string firstName = 1;</code>
     * @return The bytes for firstName.
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string firstName = 1;</code>
     * @param value The firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string firstName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstName() {
      
      firstName_ = getDefaultInstance().getFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>string firstName = 1;</code>
     * @param value The bytes for firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lastName_ = "";
    /**
     * <code>string lastName = 2;</code>
     * @return The lastName.
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lastName = 2;</code>
     * @return The bytes for lastName.
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lastName = 2;</code>
     * @param value The lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lastName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastName() {
      
      lastName_ = getDefaultInstance().getLastName();
      onChanged();
      return this;
    }
    /**
     * <code>string lastName = 2;</code>
     * @param value The bytes for lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastName_ = value;
      onChanged();
      return this;
    }

    private int roleNumber_ ;
    /**
     * <code>int32 roleNumber = 3;</code>
     * @return The roleNumber.
     */
    @java.lang.Override
    public int getRoleNumber() {
      return roleNumber_;
    }
    /**
     * <code>int32 roleNumber = 3;</code>
     * @param value The roleNumber to set.
     * @return This builder for chaining.
     */
    public Builder setRoleNumber(int value) {
      
      roleNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 roleNumber = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleNumber() {
      
      roleNumber_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<student.poc.grpc.Address> address_ =
      java.util.Collections.emptyList();
    private void ensureAddressIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        address_ = new java.util.ArrayList<student.poc.grpc.Address>(address_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        student.poc.grpc.Address, student.poc.grpc.Address.Builder, student.poc.grpc.AddressOrBuilder> addressBuilder_;

    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public java.util.List<student.poc.grpc.Address> getAddressList() {
      if (addressBuilder_ == null) {
        return java.util.Collections.unmodifiableList(address_);
      } else {
        return addressBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public int getAddressCount() {
      if (addressBuilder_ == null) {
        return address_.size();
      } else {
        return addressBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public student.poc.grpc.Address getAddress(int index) {
      if (addressBuilder_ == null) {
        return address_.get(index);
      } else {
        return addressBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder setAddress(
        int index, student.poc.grpc.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIsMutable();
        address_.set(index, value);
        onChanged();
      } else {
        addressBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder setAddress(
        int index, student.poc.grpc.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.set(index, builderForValue.build());
        onChanged();
      } else {
        addressBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder addAddress(student.poc.grpc.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIsMutable();
        address_.add(value);
        onChanged();
      } else {
        addressBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder addAddress(
        int index, student.poc.grpc.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIsMutable();
        address_.add(index, value);
        onChanged();
      } else {
        addressBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder addAddress(
        student.poc.grpc.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.add(builderForValue.build());
        onChanged();
      } else {
        addressBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder addAddress(
        int index, student.poc.grpc.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.add(index, builderForValue.build());
        onChanged();
      } else {
        addressBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder addAllAddress(
        java.lang.Iterable<? extends student.poc.grpc.Address> values) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, address_);
        onChanged();
      } else {
        addressBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        addressBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public Builder removeAddress(int index) {
      if (addressBuilder_ == null) {
        ensureAddressIsMutable();
        address_.remove(index);
        onChanged();
      } else {
        addressBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public student.poc.grpc.Address.Builder getAddressBuilder(
        int index) {
      return getAddressFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public student.poc.grpc.AddressOrBuilder getAddressOrBuilder(
        int index) {
      if (addressBuilder_ == null) {
        return address_.get(index);  } else {
        return addressBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public java.util.List<? extends student.poc.grpc.AddressOrBuilder> 
         getAddressOrBuilderList() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(address_);
      }
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public student.poc.grpc.Address.Builder addAddressBuilder() {
      return getAddressFieldBuilder().addBuilder(
          student.poc.grpc.Address.getDefaultInstance());
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public student.poc.grpc.Address.Builder addAddressBuilder(
        int index) {
      return getAddressFieldBuilder().addBuilder(
          index, student.poc.grpc.Address.getDefaultInstance());
    }
    /**
     * <code>repeated .student.poc.grpc.Address address = 4;</code>
     */
    public java.util.List<student.poc.grpc.Address.Builder> 
         getAddressBuilderList() {
      return getAddressFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        student.poc.grpc.Address, student.poc.grpc.Address.Builder, student.poc.grpc.AddressOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            student.poc.grpc.Address, student.poc.grpc.Address.Builder, student.poc.grpc.AddressOrBuilder>(
                address_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:student.poc.grpc.StudentRequest)
  }

  // @@protoc_insertion_point(class_scope:student.poc.grpc.StudentRequest)
  private static final student.poc.grpc.StudentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new student.poc.grpc.StudentRequest();
  }

  public static student.poc.grpc.StudentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentRequest>
      PARSER = new com.google.protobuf.AbstractParser<StudentRequest>() {
    @java.lang.Override
    public StudentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public student.poc.grpc.StudentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

