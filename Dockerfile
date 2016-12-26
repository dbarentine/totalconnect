FROM ubuntu:16.04

ADD api/target/*.jar /opt/barentine-api
ADD entrypoint.sh /opt/barentine-api/

EXPOSE 4567

ENTRYPOINT [ "sh" ]
CMD [ "-c", "/opt/barentine-api/entrypoint.sh" ]