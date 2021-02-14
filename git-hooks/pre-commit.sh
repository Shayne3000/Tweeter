#!C:/Program\ Files/Git/usr/bin/sh.exe

echo "Running Static analysis with spotless and detekt..."

./gradlew spotlessApply
./gradlew detekt
