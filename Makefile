run:
	cd base && sbt run

debug:
	cd base && sbt  -jvm-debug 5555 run

compile:
	cd base && sbt compile