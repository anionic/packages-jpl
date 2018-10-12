# JPL - Java <-> SWI Prolog Interface

JPL is a "library using the SWI-Prolog foreign interface and the Java jni interface providing a _bidirectional interface between Java and Prolog_ that can be used to embed Prolog in Java _as well_ as for embedding Java in Prolog. In both setups it provides a reentrant bidirectional interface."

JPL has been integrated into the full SWI-Prolog distribution starting with version 5.4.x, including binaries for MS-Windows and a Linux RPM. 

There was an initial [JPL 3.x](http://www.swi-prolog.org/packages/jpl/), now discontinued, which then evolved into the current [JPL 7.4](https://jpl7.org/). 

The objectives of JPL are to:

* enable Prolog applications to exploit any Java classes, instances, methods etc. (without requiring any wrappers, metadata etc. to be set up first);
* enable Java applications to manipulate any Standard Prolog libraries, predicates, etc. (without requiring any wrappers, metadata etc. to be set up first);
* enable hybrid Prolog+Java applications to be designed and implemented so as to take best advantage of both language systems, and to be testable, debuggable, maintainable.


### Some relevant links

* The main current JPL 7 site: <https://jpl7.org/>
  * It includes the Java API (to access Prolog from Java) and the Prolog API (to access Java from Prolog).
* The main Github repository for JPL 7 (which this one is a fork of): <https://github.com/SWI-Prolog/packages-jpl> 
* The documentation of SWI `library(jpl)`: <http://www.swi-prolog.org/pldoc/man?section=jpl>
* A Wiki on JPL: <https://github.com/ssardina-research/packages-jpl/wiki>
* The old JPL 3.x documentation: <http://www.swi-prolog.org/packages/jpl/>






