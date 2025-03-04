docker build -t microservicio2 -f Docker/Dockerfile .

build -t name of the image

-f ruta al archivo dockerfile

.

##Command to run the container

docker run -p 8082:8082 microservicio2

run

-p external port:internal port

name of the container
