# 使用基础镜像
FROM ubuntu:latest

# 安装 Squid 和其他必要的软件
RUN apt-get update && \
    apt-get install -y squid

# 复制 Squid 配置文件
COPY squid.conf /etc/squid/squid.conf

# 启动 Squid 服务
CMD ["squid","-N"]
