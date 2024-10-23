FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/product-catalog.jar product-catalog.jar
ENTRYPOINT ["java","-jar","/product-catalog.jar"]
