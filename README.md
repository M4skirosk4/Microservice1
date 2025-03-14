## How to run the microservice

#Command to create the docker image

docker build -t microservicie1 -f Docker/Dockerfile .

build -t name of the image

-f ruta al archivo dockerfile

.

#Command to run the container

docker run -p 8082:8082 microservicie1

run

-p external port:internal port

name of the container
