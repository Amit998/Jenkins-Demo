FROM tomcat:8-jre8 
LABEL maintainer="amit dutta"

ADD ./target/springmvc.war /usr/local/tomcat/webapps

EXPOSE 8043
CMD ["catalina.sh", "run"]


