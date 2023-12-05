FROM maven:3.9.5

ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn compile

CMD mvn benerator:generate