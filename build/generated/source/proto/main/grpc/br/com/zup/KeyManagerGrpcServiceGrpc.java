package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: keyManagerGrpc.proto")
public final class KeyManagerGrpcServiceGrpc {

  private KeyManagerGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeyManagerGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.NovaChavePixRequest,
      br.com.zup.NovaChavePixResponse> getNovaChavePixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "novaChavePix",
      requestType = br.com.zup.NovaChavePixRequest.class,
      responseType = br.com.zup.NovaChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.NovaChavePixRequest,
      br.com.zup.NovaChavePixResponse> getNovaChavePixMethod() {
    io.grpc.MethodDescriptor<br.com.zup.NovaChavePixRequest, br.com.zup.NovaChavePixResponse> getNovaChavePixMethod;
    if ((getNovaChavePixMethod = KeyManagerGrpcServiceGrpc.getNovaChavePixMethod) == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        if ((getNovaChavePixMethod = KeyManagerGrpcServiceGrpc.getNovaChavePixMethod) == null) {
          KeyManagerGrpcServiceGrpc.getNovaChavePixMethod = getNovaChavePixMethod =
              io.grpc.MethodDescriptor.<br.com.zup.NovaChavePixRequest, br.com.zup.NovaChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "novaChavePix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.NovaChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.NovaChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerGrpcServiceMethodDescriptorSupplier("novaChavePix"))
              .build();
        }
      }
    }
    return getNovaChavePixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.RemoveChavePixRequest,
      br.com.zup.RemoveChavePixResponse> getRemoveChavePixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeChavePix",
      requestType = br.com.zup.RemoveChavePixRequest.class,
      responseType = br.com.zup.RemoveChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.RemoveChavePixRequest,
      br.com.zup.RemoveChavePixResponse> getRemoveChavePixMethod() {
    io.grpc.MethodDescriptor<br.com.zup.RemoveChavePixRequest, br.com.zup.RemoveChavePixResponse> getRemoveChavePixMethod;
    if ((getRemoveChavePixMethod = KeyManagerGrpcServiceGrpc.getRemoveChavePixMethod) == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        if ((getRemoveChavePixMethod = KeyManagerGrpcServiceGrpc.getRemoveChavePixMethod) == null) {
          KeyManagerGrpcServiceGrpc.getRemoveChavePixMethod = getRemoveChavePixMethod =
              io.grpc.MethodDescriptor.<br.com.zup.RemoveChavePixRequest, br.com.zup.RemoveChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeChavePix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.RemoveChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.RemoveChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerGrpcServiceMethodDescriptorSupplier("removeChavePix"))
              .build();
        }
      }
    }
    return getRemoveChavePixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.ConsultaChavePixRequest,
      br.com.zup.ConsultaChavePixResponse> getConsultaChavePixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consultaChavePix",
      requestType = br.com.zup.ConsultaChavePixRequest.class,
      responseType = br.com.zup.ConsultaChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.ConsultaChavePixRequest,
      br.com.zup.ConsultaChavePixResponse> getConsultaChavePixMethod() {
    io.grpc.MethodDescriptor<br.com.zup.ConsultaChavePixRequest, br.com.zup.ConsultaChavePixResponse> getConsultaChavePixMethod;
    if ((getConsultaChavePixMethod = KeyManagerGrpcServiceGrpc.getConsultaChavePixMethod) == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        if ((getConsultaChavePixMethod = KeyManagerGrpcServiceGrpc.getConsultaChavePixMethod) == null) {
          KeyManagerGrpcServiceGrpc.getConsultaChavePixMethod = getConsultaChavePixMethod =
              io.grpc.MethodDescriptor.<br.com.zup.ConsultaChavePixRequest, br.com.zup.ConsultaChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consultaChavePix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ConsultaChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ConsultaChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerGrpcServiceMethodDescriptorSupplier("consultaChavePix"))
              .build();
        }
      }
    }
    return getConsultaChavePixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.ListarChavePixRequest,
      br.com.zup.ListarChavePixResponse> getListarChavePixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarChavePix",
      requestType = br.com.zup.ListarChavePixRequest.class,
      responseType = br.com.zup.ListarChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.ListarChavePixRequest,
      br.com.zup.ListarChavePixResponse> getListarChavePixMethod() {
    io.grpc.MethodDescriptor<br.com.zup.ListarChavePixRequest, br.com.zup.ListarChavePixResponse> getListarChavePixMethod;
    if ((getListarChavePixMethod = KeyManagerGrpcServiceGrpc.getListarChavePixMethod) == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        if ((getListarChavePixMethod = KeyManagerGrpcServiceGrpc.getListarChavePixMethod) == null) {
          KeyManagerGrpcServiceGrpc.getListarChavePixMethod = getListarChavePixMethod =
              io.grpc.MethodDescriptor.<br.com.zup.ListarChavePixRequest, br.com.zup.ListarChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listarChavePix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ListarChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.ListarChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerGrpcServiceMethodDescriptorSupplier("listarChavePix"))
              .build();
        }
      }
    }
    return getListarChavePixMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void novaChavePix(br.com.zup.NovaChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.NovaChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNovaChavePixMethod(), responseObserver);
    }

    /**
     */
    public void removeChavePix(br.com.zup.RemoveChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.RemoveChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveChavePixMethod(), responseObserver);
    }

    /**
     */
    public void consultaChavePix(br.com.zup.ConsultaChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ConsultaChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsultaChavePixMethod(), responseObserver);
    }

    /**
     */
    public void listarChavePix(br.com.zup.ListarChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ListarChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListarChavePixMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNovaChavePixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.NovaChavePixRequest,
                br.com.zup.NovaChavePixResponse>(
                  this, METHODID_NOVA_CHAVE_PIX)))
          .addMethod(
            getRemoveChavePixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.RemoveChavePixRequest,
                br.com.zup.RemoveChavePixResponse>(
                  this, METHODID_REMOVE_CHAVE_PIX)))
          .addMethod(
            getConsultaChavePixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.ConsultaChavePixRequest,
                br.com.zup.ConsultaChavePixResponse>(
                  this, METHODID_CONSULTA_CHAVE_PIX)))
          .addMethod(
            getListarChavePixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.ListarChavePixRequest,
                br.com.zup.ListarChavePixResponse>(
                  this, METHODID_LISTAR_CHAVE_PIX)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerGrpcServiceStub> {
    private KeyManagerGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void novaChavePix(br.com.zup.NovaChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.NovaChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNovaChavePixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeChavePix(br.com.zup.RemoveChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.RemoveChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveChavePixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void consultaChavePix(br.com.zup.ConsultaChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ConsultaChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsultaChavePixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarChavePix(br.com.zup.ListarChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.ListarChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListarChavePixMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerGrpcServiceBlockingStub> {
    private KeyManagerGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.NovaChavePixResponse novaChavePix(br.com.zup.NovaChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getNovaChavePixMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.RemoveChavePixResponse removeChavePix(br.com.zup.RemoveChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveChavePixMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.ConsultaChavePixResponse consultaChavePix(br.com.zup.ConsultaChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsultaChavePixMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.ListarChavePixResponse listarChavePix(br.com.zup.ListarChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getListarChavePixMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerGrpcServiceFutureStub> {
    private KeyManagerGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.NovaChavePixResponse> novaChavePix(
        br.com.zup.NovaChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNovaChavePixMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.RemoveChavePixResponse> removeChavePix(
        br.com.zup.RemoveChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveChavePixMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.ConsultaChavePixResponse> consultaChavePix(
        br.com.zup.ConsultaChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsultaChavePixMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.ListarChavePixResponse> listarChavePix(
        br.com.zup.ListarChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListarChavePixMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOVA_CHAVE_PIX = 0;
  private static final int METHODID_REMOVE_CHAVE_PIX = 1;
  private static final int METHODID_CONSULTA_CHAVE_PIX = 2;
  private static final int METHODID_LISTAR_CHAVE_PIX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOVA_CHAVE_PIX:
          serviceImpl.novaChavePix((br.com.zup.NovaChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.NovaChavePixResponse>) responseObserver);
          break;
        case METHODID_REMOVE_CHAVE_PIX:
          serviceImpl.removeChavePix((br.com.zup.RemoveChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.RemoveChavePixResponse>) responseObserver);
          break;
        case METHODID_CONSULTA_CHAVE_PIX:
          serviceImpl.consultaChavePix((br.com.zup.ConsultaChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.ConsultaChavePixResponse>) responseObserver);
          break;
        case METHODID_LISTAR_CHAVE_PIX:
          serviceImpl.listarChavePix((br.com.zup.ListarChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.ListarChavePixResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeyManagerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerGrpcService");
    }
  }

  private static final class KeyManagerGrpcServiceFileDescriptorSupplier
      extends KeyManagerGrpcServiceBaseDescriptorSupplier {
    KeyManagerGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerGrpcServiceMethodDescriptorSupplier
      extends KeyManagerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerGrpcServiceFileDescriptorSupplier())
              .addMethod(getNovaChavePixMethod())
              .addMethod(getRemoveChavePixMethod())
              .addMethod(getConsultaChavePixMethod())
              .addMethod(getListarChavePixMethod())
              .build();
        }
      }
    }
    return result;
  }
}
