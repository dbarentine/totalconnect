FROM openjdk:8-jre-alpine

ADD api/target/*.jar /opt/barentine-api/
ADD entrypoint.sh /opt/barentine-api/

RUN chmod +x /opt/barentine-api/entrypoint.sh

EXPOSE 4567

ENTRYPOINT [ "sh" ]
CMD [ "-c", "/opt/barentine-api/entrypoint.sh" ]
