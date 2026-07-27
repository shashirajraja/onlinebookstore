#!/bin/bash
# Start the webapp locally on port 9090
java -jar target/dependency/webapp-runner.jar --port 9090 target/*.war
