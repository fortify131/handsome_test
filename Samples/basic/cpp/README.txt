Before you start
* If you installed Fortify SCA on Windows Vista or later, and you have installed it in the default location (\Program Files\), you might have to copy this sample to another location and 'cd' to that location so that these directions work correctly.  Newer versions of  Windows do not allow non-administrators to modify or create files under \Program Files\.)

* You must have either the gcc compiler or the cl compiler installed on your
system to analyze this sample.

Run Fortify SCA on sample.cpp by performing the following commands:

$ sourceanalyzer -b sample-cpp -clean

$ sourceanalyzer -b sample-cpp g++ sample.cpp
 - or -
$ sourceanalyzer -b sample-cpp cl /EHsc sample.cpp

$ sourceanalyzer -b sample-cpp -scan -f sample.fpr

Open the results (FPR) in Audit Workbench:

$ auditworkbench sample.fpr

This sample demonstrates a simple dataflow vulnerability in C++ code. The
code in sample.cpp is intended to be a simple shell program; it reads
user input, checks that the user is running a safe program, and runs
that program. However, if the user specified a command such as
"safe_program ; dangerous_program", then the dangerous program would be
executed by the system() call. Fortify SCA results should contain
vulnerabilities with the following categories:

      Command Injection
      Memory Leak

Other vulnerabilities might also be found depending on the versions of Rulepacks used in the scan.

The Command Injection vulnerability indicates that user input comes
from a call to getline() on line 16 and is then  passed to argument
0 of the system() call on line 21. This is due to the absence of appropriate
input length checks.
