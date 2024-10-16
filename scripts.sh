#!/usr/bin/env bash


# java -Xmx3000m -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --test-package=com.example --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop1


# clean package
mvn clean package -Dmaven.test.skip

#Rodano apenas para Banco
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Banco --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.banco.primeira
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Banco --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.banco.segunda
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Banco --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.banco.terceira


# conta
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Conta --output-limit=100 --time-limit=60 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.conta.primeira
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Conta --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.conta.segunda
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Conta --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.conta.terceira

# validador 
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Validador --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.validador.primeira --randomseed=123
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Validador --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.validador.segunda --randomseed=456
# java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Validador --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.validador.terceira --randomseed=789


# test randoop 1
# mvn -Dtest="com.example.randoop.validador.primeira.**" test
# mvn -Dtest="com.example.randoop.validador.segunda.**" test
# mvn -Dtest="com.example.randoop.validador.terceira.**" test



# Randoop
java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Validador --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.primeira --randomseed=123

java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Validador --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.segunda --randomseed=456

java -Xmx4G -classpath ./randoop-all-4.3.3.jar:./target/classes randoop.main.Main gentests --testclass=com.example.Validador --output-limit=100 --junit-output-dir=./src/test/java --junit-package-name=com.example.randoop.terceira --randomseed=789120


# EvoSuite
mkdir src/test/java/com/example/evosuite/validador/primeira
java -jar ./evosuite-1.0.6.jar -class com.example.Validador -projectCP ./target/classes
find ./evosuite-tests/com/example -type f -name "*.java" -exec cp {} ./src/test/java/com/example/evosuite/validador/pimeira \;

mkdir src/test/java/com/example/evosuite/validador/segunda
java -jar ./evosuite-1.0.6.jar -class com.example.Validador -projectCP ./target/classes
find ./evosuite-tests/com/example -type f -name "*.java" -exec cp {} ./src/test/java/com/example/evosuite/validador/segunda \;

mkdir src/test/java/com/example/evosuite/validador/terceira
java -jar ./evosuite-1.0.6.jar -class com.example.Validador -projectCP ./target/classes
find ./evosuite-tests/com/example -type f -name "*.java" -exec cp {} ./src/test/java/com/example/evosuite/validador/terceira \;