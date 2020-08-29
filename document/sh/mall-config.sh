#!/usr/bin/env bash
app_name='kassadin-config'
docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi `docker images | grep none | awk '{print $3}'`
echo '----rm none images----'
docker run -p 8301:8301 --name ${app_name} \
--link kassadin-registry:kassadin-registry \
-v /etc/localtime:/etc/localtime \
-v /mydata/app/${app_name}/logs:/var/logs \
-d kassadin/${app_name}:1.0-SNAPSHOT
echo '----start container----'