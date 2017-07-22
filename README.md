# Sample Wallee Mobile Backend
A simple Java Spring application which acts as a backend for the mobile application. The backend is responsible for:
- Creating transactions in the wallee platform.
- Create and refresh the credentials used by the mobile app.

The backend will normally contain more code which is responsible for the business logic of the app than this sample
application. 

The sample backend can be started locally or on a public reachable instance on the Google App Engine.

# Running and Deployment

In any case you need to install `Java 8`. Depending on the way you want to deploy you may need more configurations
and tools installed. We use `gradle` for managing the dependency, building the application and the deployment of it.

In any case you need to clone the project to run it:
```
git clone https://github.com/wallee-payment/wallee-sample-mobile-backend.git
```

## Run Locally


// FIXME define how to configure the application locally.

You can run the application locally by either using `gradle bootRun` resp. `./gradlew bootRun` or you can start the 
`com.wallee.mobile.backend.Application` from within the IDE. 


## Run on Google App Engine
The application can be also deployed to a public reachable instance. This can be achieved by following the steps below:

### Setup a Google App Engine Project
- Install the Google Cloud SDK https://cloud.google.com/sdk/
- Install Java App Engine components
```
gcloud components install app-engine-java
```
- Initiate the project
```
gcloud init
```

### Configure API Credentials  

The application user ID and the shared secret we put into a meta store. We use 
- `WalleeApplicationUserId` for the application user ID and 
- `WalleeApplicationUserKey` for the API key.

You can specify both configurations within the meta store configuration:
https://console.cloud.google.com/compute/metadata

### Deploy
You are now ready to run commands
  - Stage : `./gradlew appengineStage`
  - Deploy : `./gradlew appengineDeploy`




