#!/bin/sh
echo "Running pre-commit static analysis and formatting checks..."

./gradlew detekt
./gradlew spotlessCheck
# todo replace with a call to the gradle init script for spotless and detekt like nowInAndroid

STATUS=$?

if [ ${STATUS} -ne 0 ]; then
    echo "Pre Commit Checks Failed. Please fix the above issues before committing"
    exit ${STATUS}
else
    git add .
    exit 0
fi
