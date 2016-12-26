FROM ubuntu:16.04

ADD api/target/*.jar /opt/barentine-api/
ADD entrypoint.sh /opt/barentine-api/

RUN chmod +x /opt/barentine-api/entrypoint.sh

RUN apt-get update && apt-get install -y software-properties-common python-software-properties && \
    add-apt-repository -y ppa:openjdk-r/ppa && apt-get update && \
    apt-get install -y openjdk-8-jdk && \
    update-alternatives --set java /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java && \
    update-alternatives --set javac /usr/lib/jvm/java-8-openjdk-amd64/bin/javac

EXPOSE 4567

ENTRYPOINT [ "sh" ]
CMD [ "-c", "/opt/barentine-api/entrypoint.sh" ]
