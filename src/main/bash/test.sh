#!/bin/sh

echo "Compiling java code"
javac /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.java -d /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/
echo "Running code"
java -cp /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/ Testing
rm /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.java
rm /home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.class