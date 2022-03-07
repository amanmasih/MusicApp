FROM openjdk
WORKDIR usr/lib
ENV MONGO_DATABASE=tracksdb
ENV MONGO_URL=mongodb://localhost:27017/tracksdb
ADD ./target/trackrecommender-0.0.1-SNAPSHOT.jar  /usr/lib/trackrecommender-0.0.1-SNAPSHOT.jar
#run the jar file
ENTRYPOINT ["java","-jar","trackrecommender-0.0.1-SNAPSHOT.jar"]