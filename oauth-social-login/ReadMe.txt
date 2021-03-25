Navigate to  https://github.com/settings/developers 
create a New OAuth app under the OAuth Apps left menu.
Fill in the Authorization callback URL field to 
 include the redirect URI to your app: http://<your-domain>/login/oauth2/code/github
Click on Register Application
Copy the client ID and client secret to be used Later in application yml

application.properties
spring.security.oauth2.client.registration.github.client-id= {client-id copy from github}
spring.security.oauth2.client.registration.github.client-secret={client-secret copy from gitgub}

