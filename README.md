# Java RMI simple example

## Compiling
```
javac -source 8 -target 8 simple/*.java
```

Generate stub file:
```
rmic simple.HelloWorld
```

## Running

In 3 terminals:
```
rmiregistry
java simple.HelloWorld
java simple.Greet
```

# Java RMI - timing

## Compiling
```
javac -source 8 -target 8 *.java
javac -source 8 -target 8 server/*.java
javac -source 8 -target 8 client/*.java
rmic timing.server.TimeServer
rmic timing.server.ObjectProducer
```

## Running
```
java timing.server.ObjectProducer
java timing.client.TimeClient
```