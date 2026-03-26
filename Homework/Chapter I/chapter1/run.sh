#!/bin/bash

# @Author Nakano_miku@hustIST2402
# @Time 2026-03-26

# Variables Defination
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PROJECT_HOME=/home/nakanosan/Projects/Hust-java/Homework/第1章作业/chapter1/

export PATH=$PATH:$JAVA_HOME/bin
export CLASSPATH=$CLASSPATH:$PROJECT_HOME/class

echo "Method I"

java -classpath $CLASSPATH homework.ch1.Welcome

echo "Method II"

export CLASSPATH=$CLASSPATH:$PROJECT_HOME/jar/run.jar

java -classpath $CLASSPATH homework.ch1.Welcome
