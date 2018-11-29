##Development Setup
When developing for the first time, load all js modules

```$npm install ```

To run via maven

```./mvnw spring-boot:run```

For development, install livereload extension for chrome
modify application properties to enable the following:

```
spring.devtools.livereload.enabled=true
spring.devtools.restart.enabled=true
```
When using intellij for example, just hit rebuild to see your changes. The livereload extension should reload the page.
An alternative is to run via maven commandline which eliminates the extra step of having to manually 
'Rebuild ui-webapp' in the Build menu option of Intellij. All templates and static assets will automatically be deployed.

Note: You can only run one LiveReload server at a time. Before starting your application, ensure that no other LiveReload servers are running. If you start multiple applications from your IDE, only the first has LiveReload support.
## Using assets like javascript, styles, etc

Asset files are in the following directories:


Images and styles are in here src/resources/static

HTML templates are located here src/resources/templates and uses Thymeleaf for template rendering

This project uses eslint to format javascript files. If you want to cleanup a javascript file to conform to the eslint rules
run the following in the ui-webapp directory:

```eslint -c .eslintrc.js --fix src/main/js/navbar/YourJSCode.js```

Note: Disable cache in chrome to enable rapid development