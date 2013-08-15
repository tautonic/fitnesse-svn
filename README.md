fitnesse-svn
============

Provides Subversion integration with FitNesse using the CM_SYSTEM mechanism and relies on svn command provided by OS

Usage:
1. Build with maven : mvn clean install
2. Drop the fitnesse-svn.jar into plugins folder in the underneath the directory where your fitnesse.jar is located
3. Start Fitnesse with java "-DCM_SYSTEM=org.fitnesse.plugins.SvnFitnesse %SVN_USER%/%SVN_PASSWORD%" -jar fitnesse-standalone.jar
