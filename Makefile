
MAINCLASS = Main

J = java
JC = javac

JFLAGS = -Xlint:unchecked
CP = 

SRCDIR = src
OBJDIR = bin

all: $(SRCDIR)/*.java
	$(JC) -d $(OBJDIR) $(JFLAGS) -cp "$(CP)" $(SRCDIR)/*.java

run: $(OBJDIR)/*.class
	$(J) -cp "$(OBJDIR);$(CP)" $(MAINCLASS)

clean:
	del /q /s $(OBJDIR)\\*.class
