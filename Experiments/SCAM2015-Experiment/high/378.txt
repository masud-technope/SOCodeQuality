#!/bin/bash

cmdLineJMXJar=./cmdline-jmxclient-0.10.3.jar
user=yourUser
password=yourPassword
jmxHost=localhost
port=9003

#No User and password so pass '-'
echo "Available Operations for com.company.data:type=datasystem,id=0"
java -jar ${cmdLineJMXJar} ${user}:${password} ${jmxHost}:${port} com.company.data:type=datasystem,id=0

echo "Executing XML update..."
java -jar ${cmdLineJMXJar} - ${jmxHost}:${port} com.company.data:type=datasystem,id=0 jmxForceRefresh