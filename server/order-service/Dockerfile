FROM sudo248dev/soc:0.0.1

WORKDIR /app

ENV JAR_FILE=order-service-0.0.1.jar
ENV APP=/app/$JAR_FILE
ENV PORT=8088

COPY target/$JAR_FILE $APP
EXPOSE $PORT

CMD /app/start-app.sh