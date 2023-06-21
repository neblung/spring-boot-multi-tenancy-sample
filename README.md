# Small Multitenancy Demo

Key points: `ThreadLocal`, `Filter` and `@RequestScope`

inspired by: https://www.baeldung.com/multitenancy-with-spring-data-jpa
## Calls

* http://localhost:8080/api/mandanten

  curl localhost:8080/api/file0501/meineNachrichtenId -H "Mandant: tic"

## Next steps

### Test

Statt von der application.properties kommt root aus dem Test

