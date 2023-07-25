
#FROM openjdk:17-alpine AS build
# IF YOU ARE USING SILICON M1 - PLEASE USE JDK IMAGE: azul/zulu-openjdk-alpine:17.0.2 INSTEAD OF openjdk:17-alpine
FROM azul/zulu-openjdk-alpine:17.0.2 AS build
MAINTAINER Alex_ABA
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle settings.gradle gradlew $APP_HOME
COPY gradle $APP_HOME/gradle
#RUN microdnf install findutils
RUN ./gradlew build || return 0
COPY . .
RUN ./gradlew build

#FROM openjdk:17-alpine
# IF YOU ARE USING SILICON M1 - PLEASE USE JDK IMAGE: azul/zulu-openjdk-alpine:17.0.2 INSTEAD OF openjdk:17-alpine
FROM azul/zulu-openjdk-alpine:17.0.2
LABEL name="ABA API"
COPY --from=build /usr/app/build/libs/*.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "/usr/src/myapp/app.jar"]

