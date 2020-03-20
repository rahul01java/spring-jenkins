FROM java:8 
EXPOSE 1010
COPY spring-jenkins-0.0.1-SNAPSHOT.jar /home/spring-jenkins-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/spring-jenkins-0.0.1-SNAPSHOT.jar"]