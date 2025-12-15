# **MICROSERVICES**
# _Structure Spring Project_
![alt text](Resources\image.png)

# 1.Dependencies GATEWAY
    * Gateway (para rutas)
    * Eureka Discovery Client (REST service)
    * Config Client (config de aplicacion)
    * Springboot Acuator (ver opciones de aplicacion)
# 2.Dependencies EUREKA
    * Eureka Server
    * Config Client
    * Spring Actuator
    * aplication.yml de Eureka
    * Resource un new file .banner (banner SpringBoot)
![alt text](Resources\image-2.png)
# 3.Dependencies CONFIG
    * Config server
# 4.Dependencies STUDENTS
    * Spring WEB
    * Spring JPA
    * Spring MySQL Drive
    * Config Client
    * Eureka Discovery Client
    * Spring Actuator(para seguimiento, metricas)
    * Resource -> aplication.yml students
![alt text](Resources\image-3.png)
# 5.Dependencies COURSES
    * Spring WEB
    * Spring JPA
    * Spring PostgreSQL Drive
    * Config Client
    * Eureka Discovery Client
    * Spring Actuator(para seguimiento, metricas)
    * Resource -> aplication.yml courses
![alt text](Resources\image-4.png)