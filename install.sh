#!/bin/sh

mvn install:install-file -Durl=file:repo -DgroupId=processing -DartifactId=core -Dversion=2.0.3 -Dpackaging=jar -Dfile=lib/core.jar
lein install
