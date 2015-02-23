[![Build Status](https://travis-ci.org/yosethegame/java-sunhttpserver-example.svg)](https://travis-ci.org/yosethegame/java-sunhttpserver-example)

I pass the two first challenges :)

## Get ready

[fork](https://help.github.com/articles/fork-a-repo) me and [clone](https://help.github.com/articles/fork-a-repo#step-2-clone-your-fork) your repository locally.

[install Gradle](http://www.gradle.org/)

check your install: in the directory of the repo, run

```sh
gradle clean ci
```

Build should be successful and the tests should pass (14 java, 1 javascript)

## See it working

Lauch the application

```sh
gradle run
```

Open your browser and navigate to

```sh
http://localhost:8080/ping
```

You should see the Json

```sh
{
  alive : true
}
```

## Deploy

Deploy and run your server so that the game can call it.