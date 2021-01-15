#!/bin/sh

javac /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.java -d /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/
java -cp /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/ Testing
rm /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.java
rm /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.class