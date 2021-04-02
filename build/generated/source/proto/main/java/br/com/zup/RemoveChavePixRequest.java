// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerGrpc.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.RemoveChavePixRequest}
 */
public final class RemoveChavePixRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.RemoveChavePixRequest)
    RemoveChavePixRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveChavePixRequest.newBuilder() to construct.
  private RemoveChavePixRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveChavePixRequest() {
    pixId_ = "";
    clienteId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveChavePixRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveChavePixRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            pixId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clienteId_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_RemoveChavePixRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_RemoveChavePixRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.RemoveChavePixRequest.class, br.com.zup.RemoveChavePixRequest.Builder.class);
  }

  public static final int PIXID_FIELD_NUMBER = 1;
  private volatile java.lang.Object pixId_;
  /**
   * <code>string pixId = 1;</code>
   * @return The pixId.
   */
  @java.lang.Override
  public java.lang.String getPixId() {
    java.lang.Object ref = pixId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pixId_ = s;
      return s;
    }
  }
  /**
   * <code>string pixId = 1;</code>
   * @return The bytes for pixId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPixIdBytes() {
    java.lang.Object ref = pixId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pixId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENTEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object clienteId_;
  /**
   * <code>string clienteId = 2;</code>
   * @return The clienteId.
   */
  @java.lang.Override
  public java.lang.String getClienteId() {
    java.lang.Object ref = clienteId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clienteId_ = s;
      return s;
    }
  }
  /**
   * <code>string clienteId = 2;</code>
   * @return The bytes for clienteId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClienteIdBytes() {
    java.lang.Object ref = clienteId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clienteId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getPixIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pixId_);
    }
    if (!getClienteIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clienteId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPixIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pixId_);
    }
    if (!getClienteIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clienteId_);
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
    if (!(obj instanceof br.com.zup.RemoveChavePixRequest)) {
      return super.equals(obj);
    }
    br.com.zup.RemoveChavePixRequest other = (br.com.zup.RemoveChavePixRequest) obj;

    if (!getPixId()
        .equals(other.getPixId())) return false;
    if (!getClienteId()
        .equals(other.getClienteId())) return false;
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
    hash = (37 * hash) + PIXID_FIELD_NUMBER;
    hash = (53 * hash) + getPixId().hashCode();
    hash = (37 * hash) + CLIENTEID_FIELD_NUMBER;
    hash = (53 * hash) + getClienteId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.RemoveChavePixRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.RemoveChavePixRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.RemoveChavePixRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.RemoveChavePixRequest parseFrom(
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
  public static Builder newBuilder(br.com.zup.RemoveChavePixRequest prototype) {
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
   * Protobuf type {@code br.com.zup.RemoveChavePixRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.RemoveChavePixRequest)
      br.com.zup.RemoveChavePixRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_RemoveChavePixRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_RemoveChavePixRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.RemoveChavePixRequest.class, br.com.zup.RemoveChavePixRequest.Builder.class);
    }

    // Construct using br.com.zup.RemoveChavePixRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pixId_ = "";

      clienteId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_RemoveChavePixRequest_descriptor;
    }

    @java.lang.Override
    public br.com.zup.RemoveChavePixRequest getDefaultInstanceForType() {
      return br.com.zup.RemoveChavePixRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.RemoveChavePixRequest build() {
      br.com.zup.RemoveChavePixRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.RemoveChavePixRequest buildPartial() {
      br.com.zup.RemoveChavePixRequest result = new br.com.zup.RemoveChavePixRequest(this);
      result.pixId_ = pixId_;
      result.clienteId_ = clienteId_;
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
      if (other instanceof br.com.zup.RemoveChavePixRequest) {
        return mergeFrom((br.com.zup.RemoveChavePixRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.RemoveChavePixRequest other) {
      if (other == br.com.zup.RemoveChavePixRequest.getDefaultInstance()) return this;
      if (!other.getPixId().isEmpty()) {
        pixId_ = other.pixId_;
        onChanged();
      }
      if (!other.getClienteId().isEmpty()) {
        clienteId_ = other.clienteId_;
        onChanged();
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
      br.com.zup.RemoveChavePixRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.RemoveChavePixRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pixId_ = "";
    /**
     * <code>string pixId = 1;</code>
     * @return The pixId.
     */
    public java.lang.String getPixId() {
      java.lang.Object ref = pixId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pixId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pixId = 1;</code>
     * @return The bytes for pixId.
     */
    public com.google.protobuf.ByteString
        getPixIdBytes() {
      java.lang.Object ref = pixId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pixId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pixId = 1;</code>
     * @param value The pixId to set.
     * @return This builder for chaining.
     */
    public Builder setPixId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pixId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pixId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixId() {
      
      pixId_ = getDefaultInstance().getPixId();
      onChanged();
      return this;
    }
    /**
     * <code>string pixId = 1;</code>
     * @param value The bytes for pixId to set.
     * @return This builder for chaining.
     */
    public Builder setPixIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pixId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clienteId_ = "";
    /**
     * <code>string clienteId = 2;</code>
     * @return The clienteId.
     */
    public java.lang.String getClienteId() {
      java.lang.Object ref = clienteId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clienteId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clienteId = 2;</code>
     * @return The bytes for clienteId.
     */
    public com.google.protobuf.ByteString
        getClienteIdBytes() {
      java.lang.Object ref = clienteId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clienteId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clienteId = 2;</code>
     * @param value The clienteId to set.
     * @return This builder for chaining.
     */
    public Builder setClienteId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clienteId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clienteId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClienteId() {
      
      clienteId_ = getDefaultInstance().getClienteId();
      onChanged();
      return this;
    }
    /**
     * <code>string clienteId = 2;</code>
     * @param value The bytes for clienteId to set.
     * @return This builder for chaining.
     */
    public Builder setClienteIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clienteId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:br.com.zup.RemoveChavePixRequest)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.RemoveChavePixRequest)
  private static final br.com.zup.RemoveChavePixRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.RemoveChavePixRequest();
  }

  public static br.com.zup.RemoveChavePixRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveChavePixRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveChavePixRequest>() {
    @java.lang.Override
    public RemoveChavePixRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveChavePixRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveChavePixRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveChavePixRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.RemoveChavePixRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

