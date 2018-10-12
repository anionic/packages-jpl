To recompile jpl.c to jpl.dll (for Windows),
ensure that JAVA_HOME and PL_HOME are appropriately set in your environment,
then run

	.\build.bat

To recompile jpl.c to libjpl.so (for Linux),
ensure that JAVA_HOME and PL_HOME are appropriately set in your environment,
then run

	./build.sh

----
Paul Singleton (paul.singleton@bcs.org.uk)
March 2004


Compilation instructions for jpl.c

export  JAVA_HOME=$(readlink -f /usr/bin/javac | sed "s:bin/javac::")
export  LD_LIBRARY_PATH=$LD_LIBRARY_PATH:.
gcc -I${JAVA_HOME}/include  -shared jpl.c -o libjpl.so -fPIC -lrt

Note that -lrt needs to be at the end!
Note also that libjpl.so needs to be in your LD_LIBRARY_PATH

