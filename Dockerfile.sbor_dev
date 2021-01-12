#Original Image, https://hub.docker.com/_/openjdk
FROM openjdk:11
# host /var/lib/docker/volumes/{volume_name} 에 볼륨 생성
VOLUME /sbor_dev_volume
ADD ./build/libs/ourRestaurant-0.0.1-SNAPSHOT.jar app.jar
#ENV JAVA_OPTS="" 컨테이너의 환경변수
ENTRYPOINT ["java","-jar","/app.jar"]