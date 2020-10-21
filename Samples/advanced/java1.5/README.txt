Run Fortify Static Code Analyzer on ResourceInjection.java by running the following commands:

$ sourceanalyzer -b java1.5 -clean
$ sourceanalyzer -b java1.5 -source 1.5 ResourceInjection.java
$ sourceanalyzer -b java1.5 -scan -f java15.fpr

Use Audit Workbench to open the results file java15.fpr. The results should have one Path Manipulation issue, one J2EE Bad Practices issue, and one Poor Style issue.

The Path Manipulation issue indicates that user input passing from the program
arguments, through ArrayList, and into the File constructor on line 9 can
manipulate the file name.
