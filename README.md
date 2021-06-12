# Demo Application for Interview



## Overview
Project was created with:
 - Spring Boot
 - Prostgres Database
 - Project can be run from IDE as a Spring Boot Application,  All tables will be created and populated with some data. Before running you must set your database properties in the application.properties file. 



Apis for testing with default data

provider apis
<br/><br/>
http://localhost:8080/api/v1/provider
<br/><br/>
http://localhost:8080/api/v1/providers/?id=CharlesDarwin
<br/><br/>
http://localhost:8080/api/v1/providers/getByFirstName?name=Charles
<br/><br/>
http://localhost:8080/api/v1/providers/getByLastName?name=Darwin



patient apis
<br/><br/>
http://localhost:8080/api/v1/patients



Availability apis 
<br/><br/>
http://localhost:8080/api/v1/availabilites
<br/><br/>
http://localhost:8080/api/v1/availabilites/?id=2
<br/><br/>
http://localhost:8080/api/v1/availabilites/getByDates?providerId=CharlesDarwin&startDate=2021-01-02T15:00&endDate=2022-01-02T15:00



Appointment apis
<br/><br/>
http://localhost:8080/api/v1/appointments
<br/><br/>
http://localhost:8080/api/v1/appointments/bookAppointment?availabilityId=2&patientId=JohnSmith

 

