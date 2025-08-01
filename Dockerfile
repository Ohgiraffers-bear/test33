FROM tomcat:9.0.107-jdk17-temurin

# WAR 파일 복사
COPY build/libs/deployTest-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080