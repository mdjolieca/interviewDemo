# Demo Application for Interview



## Table of contents
* [Technology](#technology)



## Technology
Project is created with:
 - Spring Boot
 - Prostgres Database
 - Project can be run from IDE as a Spring Boot Application, database will be created and populated with some dummy data.



Apis for testing

provider apis
http://localhost:8080/api/v1/provider
http://localhost:8080/api/v1/providers/?id=CharlesDarwin
http://localhost:8080/api/v1/providers//getByFirstName?name=Charles
http://localhost:8080/api/v1/providers//getByLastName?name=Darwin



patient apis
http://localhost:8080/api/v1/patients



Availability apis 
http://localhost:8080/api/v1/availabilites
http://localhost:8080/api/v1/availabilites/?id=2
http://localhost:8080/api/v1/availabilites/getByDates?providerId=CharlesDarwin&startDate=2021-01-02T15:00&endDate=2022-01-02T15:00



Appointment apis
http://localhost:8080/api/v1/appointments
http://localhost:8080/api/v1/appointments/bookAppointment?availabilityId=2&patientId=JohnSmith

 

