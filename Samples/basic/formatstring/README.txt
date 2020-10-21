Compile formatstring.c and run it.
	
Normally, it simply echos the text that you entered, truncated after 
MAX_SIZE characters have been entered. There are a few ways you can exploit
this simple program:
- You can crash the program by entering something like: %x%s
- You can see what is on the stack by entereing %08x%08x%08x...etc.
For more information on these and other exploits, see Exploiting Software [2004 Hoglund & McGraw] p.317-324

Note that you must have the gcc compiler or the cl compiler installed on your
system to analyze this sample.

Run Fortify SCA on formatstring.c by entering the following commands:

$ sourceanalyzer -b formatstring -clean

$ sourceanalyzer -b formatstring gcc formatstring.c
 - or -
$ sourceanalyzer -b formatstring cl formatstring.c

$ sourceanalyzer -b formatstring -scan -f formatstring.fpr

Open the results in Audit Workbench:

$ auditworkbench formatstring.fpr

The output should contain a Format String vulnerability. Other categories
of vulnerabilities might also be included in the results depending on the Rulepacks used in the scan.
