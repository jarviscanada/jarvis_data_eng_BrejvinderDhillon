#!/bin/bash

#ARGUMENTS
CONTAINER=jrvs-psql
command=$1
db_username=$2
db_password=$3

#FUNCTIONS
created() {
  if [ $(docker container ls -a -f name=$CONTAINER | wc -l) -eq 2 ]; then
    return 0
  else
    return 1
  fi
}

running() {
  if [ $(docker ps -f name=${CONTAINER} | wc -l) -eq 2 ]; then
    return 0
  else
    return 1
  fi
}

create() {
  if created; then
    echo "ERROR: the ${CONTAINER} container has already been created"
    err_start_usage
    err_stop_usage
    exit 1
  fi

  docker pull postgres

  docker volume create pgdata

  docker run --name ${CONTAINER} -e POSTGRES_PASSWORD=${db_password} -e POSTGRES_USER=${db_username} -d -v pgdata:/var/lib/postgresql/data -p 5432:5432 postgres

  if ! created; then
    echo "ERROR: the ${CONTAINER} container could not be created."
    exit 1
  fi
}

#ERROR USAGE FUNCTIONS
err_create_usage() {
  echo "  SUGGESTED USAGE: psql_docker.sh create db_username db_password"
}

err_start_usage() {
  echo "  SUGGESTED USAGE: psql_docker.sh start"
}

err_stop_usage() {
  echo "  SUGGESTED USAGE: psql_docker.sh stop"
}

#MAIN
systemctl --quiet status docker || systemctl --quiet start docker

case $command in
create)
  if [ $# -eq 3 ]; then
    create
    exit $?
  else
    echo "ERROR: db_username and db_password not given."
    err_create_usage
    exit 1
  fi
  ;;
start)
  if ! created; then
    echo "ERROR: the ${CONTAINER} container has not been created."
    err_create_usage
    exit 1
  elif running; then
    echo "ERROR: the ${CONTAINER} container is already running."
    err_stop_usage
    exit 1
  else
    docker container start ${CONTAINER}
    exit $?
  fi
  ;;
stop)
  if ! created; then
    echo "ERROR: the ${CONTAINER} container has not been created."
    err_create_usage
    exit 1
  elif ! running; then
    echo "ERROR: the ${CONTAINER} container is not running."
    exit 1
  else
    docker container stop ${CONTAINER}
    exit $?
  fi
  ;;
*)
  echo "ERROR: Unknown Command or Insufficient Arguments or Incorrect Usage"
  err_create_usage
  err_start_usage
  err_stop_usage
  exit 1
  ;;
esac

exit 0
