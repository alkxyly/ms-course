FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-payment-0.0.1-SNAPSHOT.jar hr-payroll.jar
ENTRYPOINT ["java","-jar","/hr-payroll.jar"]