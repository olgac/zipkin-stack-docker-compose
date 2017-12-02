#!/bin/bash

ROOT_PATH=$(dirname "$0");

echo "$(date) STARTED";

for f in $ROOT_PATH/zipkin-*; do cd $f; mvn clean install; cd -; done;

cd $ROOT_PATH;
docker network create zipkin;
docker-compose up --build -d;

echo "$(date) FINISHED";