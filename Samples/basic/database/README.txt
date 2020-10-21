The SQL code in this sample demonstrates some simple issues that can
exist in SQL code.

To analyze the file database.pks, run the following commands:

$ sourceanalyzer -b db -clean
$ sourceanalyzer -b db database.pks
$ sourceanalyzer -b db -scan -f database.fpr

Open the results in Audit Workbench:

$ auditworkbench database.fpr

The output shows an Access Control: Database vulnerability. The user
supplies a string that appears to be used as a username in the SQL query
without being properly validated and/or escaped, which might represent an
access control problem.

Depending on the Rulepacks used in the scan, other vulnerabilities might
be discovered.