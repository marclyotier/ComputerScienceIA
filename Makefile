exe := ComputerScienceIA
sources := src/*.java
main-class := Main

build : clean
	javac $(sources) -d bin

jar: build
	@echo "Manifest-Version: 1.0\nMain-Class: $(main-class)" >> MANIFEST.MF
	@cd bin && jar cfm ../$(exe).jar ../MANIFEST.MF *
	@rm MANIFEST.MF

run:
	java -jar $(exe).jar

clean:
	@-mkdir bin
	@-rm -r bin/*
	@-rm $(exe).jar

clear:
	clear

test: clean jar clear run