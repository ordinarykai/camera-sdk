# Camera Spring Boot Starter 项目结构

```text
camera-spring-boot-starter/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── camera/
│   │   │           └── sdk/
│   │   │               ├── adapter/              # 厂商协议适配层
│   │   │               │   ├── hikvision/        # 海康威视实现
│   │   │               │   │   ├── HikvisionAdapter.java    # 适配器主类
│   │   │               │   │   └── HikvisionSDKWrapper.java  # SDK封装类
│   │   │               │   ├── dahua/            # 大华实现
│   │   │               │   ├── uniview/          # 宇视科技实现
│   │   │               │   └── gb28181/          # GB/T 28181协议实现
│   │   │               │       ├── GB28181Adapter.java
│   │   │               │       └── sip/          # SIP协议处理
│   │   │               │           ├── SipProcessor.java   # SIP消息处理器
│   │   │               │           └── SipStackManager.java # SIP协议栈管理
│   │   │               │
│   │   │               ├── config/              # 配置管理
│   │   │               │   ├── CameraAutoConfiguration.java # 自动配置
│   │   │               │   ├── SdkProperties.java   # 配置文件映射
│   │   │               │   └── VendorConfig.java    # 厂商专属配置
│   │   │               │
│   │   │               ├── constants/           # 常量定义
│   │   │               │   ├── CommandConstants.java # 指令常量
│   │   │               │   └── ErrorConstants.java   # 错误代码
│   │   │               │
│   │   │               ├── core/                # 核心接口层
│   │   │               │   ├── CameraOperations.java # 设备操作接口
│   │   │               │   └── StreamProcessor.java  # 流处理抽象
│   │   │               │
│   │   │               ├── dto/                 # 数据传输对象
│   │   │               │   ├── request/         # 请求参数
│   │   │               │   │   ├── DeviceBaseRequest.java # 基础请求
│   │   │               │   │   ├── PlaybackRequest.java   # 回放请求
│   │   │               │   │   └── PtzControlRequest.java # 云台控制
│   │   │               │   └── response/        # 响应参数
│   │   │               │       ├── DeviceInfoResponse.java # 设备信息
│   │   │               │       └── StreamResponse.java     # 视频流信息
│   │   │               │
│   │   │               ├── exception/           # 异常体系
│   │   │               │   ├── CameraException.java # 自定义异常基类
│   │   │               │   └── ErrorCode.java   # 错误码枚举
│   │   │               │
│   │   │               ├── service/             # 服务层
│   │   │               │   ├── impl/
│   │   │               │   │   └── CameraServiceImpl.java # 核心实现
│   │   │               │   └── stream/          # 流媒体服务
│   │   │               │       ├── StreamConverter.java    # 流格式转换
│   │   │               │       └── StreamManager.java       # 流生命周期管理
│   │   │               │
│   │   │               ├── support/            # 支撑模块
│   │   │               │   ├── auth/            # 鉴权模块
│   │   │               │   │   └── AuthProcessor.java      # 认证处理器
│   │   │               │   └── util/            # 工具类
│   │   │               │       ├── ProtocolUtils.java      # 协议工具
│   │   │               │       └── SDKLoader.java           # SDK加载器
│   │   │               │
│   │   │               └── CameraStarterApplication.java # 启动类（测试用）
│   │   │
│   │   └── resources/
│   │       ├── META-INF/
│   │       │   └── spring.factories             # 自动配置注册
│   │       │
│   │       ├── vendors/                        # 厂商SDK资源
│   │       │   ├── hikvision/
│   │       │   │   └── sdk-config.xml          # 海康SDK配置文件
│   │       │   └── dahua/
│   │       │       └── license.lic            # 大华授权文件
│   │       │
│   │       └── application.yml                 # 默认配置
│   │
│   └── test/                                   # 测试套件
│       └── java/
│           └── com/
│               └── camera/
│                   └── sdk/
│                       ├── adapter/
│                       │   └── hikvision/
│                       │       └── HikvisionAdapterTest.java # 适配器测试
│                       └── service/
│                           └── CameraServiceTest.java         # 服务测试
│
├── pom.xml                                     # Maven构建配置
└── README.md                                   # 项目文档