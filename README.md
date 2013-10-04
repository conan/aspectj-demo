aspectj-demo
============

A small demo to show the introduction of an aspect to a dummy logging system.  The system without aspects can be seen at the `clean` tag, and the improved system with the aspect introduced is at the `aspect` tag.

The base system calls a slow logging method, `LogService.log(String message)`.  The updated system introduces an aspect that fires off each call to this method in a new thread, so that the application isn't bound by the performance of the log method.
