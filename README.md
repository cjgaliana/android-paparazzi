# android-paparazzi


## Run the Paparazzi tests
Runs tests and generates an HTML report at sample/build/reports/paparazzi/ showing all test runs and snapshots.

`$ ./gradlew app-ui:testDebug`

## Generate baseline
Saves snapshots as golden values to a predefined source-controlled location (defaults to src/test/snapshots).

`$ ./gradlew app-ui:recordPaparazziDebug`

## Verify the output
Runs tests and verifies against previously-recorded golden values. Failures generate diffs at sample/out/failures.

`$ ./gradlew app-ui:verifyPaparazziDebug`
