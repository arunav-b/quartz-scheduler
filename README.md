# Scheduler with File Watcher

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

> **_NOTE:_** Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Quartz Scheduler

The heart of the framework is the `Scheduler`. It is responsible for managing the runtime environment for our application.

To ensure scalability, Quartz is based on a multi-threaded architecture. When started, the framework initializes a set of worker threads that are used by the Scheduler to execute Jobs.

This is how the framework can run many Jobs concurrently. It also relies on a loosely coupled set of ThreadPool management components for managing the thread environment.

The key interfaces of the API are:

`Scheduler` – the primary API for interacting with the scheduler of the framework
`Job` – an interface to be implemented by components that we wish to have executed
`JobDetail` – used to define instances of Jobs
`Trigger` – a component that determines the schedule upon which a given Job will be performed
`JobBuilder` – used to build JobDetail instances, which define instances of Jobs
`TriggerBuilder` – used to build Trigger instances

### Links

- [Quartz Scheduler Overview](http://www.quartz-scheduler.org/overview/)
- [Baeldung - Introduction to Quartz](https://www.baeldung.com/quartz)
- [Guide to Quartz with Spring Boot](https://stackabuse.com/guide-to-quartz-with-spring-boot-job-scheduling-and-automation/)
- [Quartz with Quarkus](https://quarkus.io/guides/quartz)
- [Quartz with File Watcher](https://examples.javacodegeeks.com/enterprise-java/quartz/java-quartz-file-watcher-example/#:~:text=To%20setup%20a%20file%20watcher,set%20forth%20in%20the%20job.)

## Related Guides

- Camel Kotlin ([guide](https://camel.apache.org/camel-quarkus/latest/reference/extensions/kotlin.html)): Write Camel integration routes in Kotlin
- Camel Quartz ([guide](https://camel.apache.org/camel-quarkus/latest/reference/extensions/quartz.html)): Schedule sending of messages using the Quartz 2.x scheduler
- Quartz ([guide](https://quarkus.io/guides/quartz)): Schedule clustered tasks with Quartz
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
