http://stackoverflow.com/questions/4955635/how-to-add-local-jar-files-in-maven-project

 Install local jar files to in maven repo

  mvn install:install-file
 -Dfile=<path-to-file>
 -DgroupId=<group-id>
 -DartifactId=<artifact-id>
 -Dversion=<version>
 -Dpackaging=<packaging>
 -DgeneratePom=true


 Example:
  mvn install:install-file -Dfile=D:\Work\IDEA\algorithms4\libs\stdlib.jar -DgroupId=stdlib -DartifactId=stdlib -Dversion=1.0 -Dpackaging=jar -DgeneratePom=true
