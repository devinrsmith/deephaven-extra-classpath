# deephaven-extra-classpath

This is a quick example of how to build your own library and add the jar(s) onto the Deephaven classpath.
While this construction is centered around extending the Deephaven docker images, the same concepts apply for other deployment models.

For advanced integrators who need to control the full classpath, see [deephaven-server-customization](https://github.com/devinrsmith/deephaven-server-customization).

## Build

### Test and build the library jar(s)

```bash
./gradlew build
```

### Extend the Deephaven image with the extra jar(s)

```bash
docker buildx build \
  --build-context my-simple-library=my-simple-library/build/libs \
  --build-context my-deephaven-library=my-deephaven-library/build/libs \
  --tag deephaven/server-extra-classpath \
  --load \
  .
```

### Run

```bash
docker run \
  --rm \
  --name deephaven \
  -p 10000:10000 \
  deephaven/server-extra-classpath
```

## my-simple-library

This is simple, standalone code that doesn't have any external dependencies, nor dependencies on Deephaven. It is the
simplest case for packaging and adding to the Deephaven classpath.

## my-deephaven-library

This is an example library that depends on Deephaven, but doesn't have any other external dependencies. This is also
simple for packaging and adding to the Deephaven classpath.

## my-complex-library (TBD)

This is an example library that has external dependencies. Packaging is more complex, and care must be taken to ensure
the dependencies don't conflict with the Deephaven classpath.

## Related

* https://deephaven.io/core/docs/how-to-guides/configuration/docker-application/
