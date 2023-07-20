#!/bin/sh
echo "Running pre-commit static analysis and formatting checks..."

./gradlew detekt spotlessCheck

STATUS=$?

if [ ${STATUS} -ne 0 ]; then
    echo "Pre Commit Checks Failed. Please fix the above issues before committing"
    exit ${STATUS}
else
    git add .
    exit 0
fi
