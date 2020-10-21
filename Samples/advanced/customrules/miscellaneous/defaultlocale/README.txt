DEFAULT LOCALE CUSTOM RULES
===========================

The rules contained in default_locale_rules.xml rulepack can be used to detect
the use of default locale in the real-world applications on creation of
Java InputStreamReader and OutputStreamWriter, as well as on invocation of
String.getBytes() method.

From the $FORTIFY_HOME/Samples/advanced/customrules/miscellaneous/defaultlocale 
directory, run:

$ sourceanalyzer -b defaultlocale -clean
$ sourceanalyzer -b defaultlocale LocalizedCodeSample.java
$ sourceanalyzer -b defaultlocale -rules default_locale_rules.xml -scan -f defaultlocale.fpr

And view the results with Audit Workbench:

$ auditworkbench defaultlocale.fpr

You should see the following output:

	Unchecked Return Value: 1
	Default Locale: 1
	Path Manipulation: 2
	Unreleased Resource: 2
	J2EE Bad Practices: Leftover Debug Code: 1
