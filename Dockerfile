# syntax=docker/dockerfile:1.4
FROM ghcr.io/deephaven/server:0.35.0

# By default, Deephaven sources additional jars from /apps/libs/
# See https://deephaven.io/core/docs/how-to-guides/configuration/docker-application/
COPY --link --from=my-simple-library my-simple-library.jar /apps/libs/
